package com.example.cjgreen.a17dbhandling;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;  // 생성 또는 열기할 데이터베이스 이름
    EditText editText2; // 생성할 테이블 이름
    EditText editText3; // 입력시 데이터필드1
    EditText editText4; // 입력시 데이터필드2
    EditText editText5; // 입력시 데이터필드3


    TextView textView;  //하단에 로그 또는 처리 결과를 보여줄 텍스트 뷰

    Button button;//생성 또는 열기 버튼
    Button button2;//테이블 생성 버튼
    Button button3;//데이터 입력 버튼
    Button button4;//데이터조회 버튼

    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText); // 데이터베이스 이름
        // 수욜 수업중에 버그 유발 부분.
        // 아래 4개 변수 선언을 안했음.... 급하게 하면 빠드리는 부분이 생김....
        editText2 = (EditText) findViewById(R.id.editText2); // 테이블 이름
        editText3 = (EditText) findViewById(R.id.editText3); // 필드1
        editText4 = (EditText) findViewById(R.id.editText4); // 필드2
        editText5 = (EditText) findViewById(R.id.editText5); // 필드3

        textView = (TextView) findViewById(R.id.textView);

        // 데이터베이스 열기 버튼 클릭시 동작
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //사용자가 입력한 데이터베이스 이름을 가져온다.
                String databaseName = editText.getText().toString();
                //데이터베이스를 열거나 생성하기 위한 메소드를 호출한다.
                //이 메소드는 우리가 직접 만든다.
                createDatabase(databaseName);
            }
        });

        // 테이블생성 버튼 클릭시 동작
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tableName = editText2.getText().toString();
                createTable(tableName);
            }
        });

        // 자료입력 버튼 클릭시 동작
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //입력창으로부터 테이블이름, 첫필드값, 두번재필드값, 세번째필드값
                String tableName = editText2.getText().toString().trim();
                String name = editText3.getText().toString().trim();
                String ageStr = editText4.getText().toString().trim();
                String mobile = editText5.getText().toString().trim();
                // 문자열로 입력된 나이를 숫자로 변환. 정수형 변수를 선언하고 초기화
                int age = -1;
                // 문자열을 숫자 변환시 오류가 발생할 경우 처리하기 위하여 추가
                try {
                    age= Integer.parseInt(ageStr);
                }catch(Exception e) {

                }

                //println("[dbg]");
                //println(tableName);
                //println(name);
                //println(ageStr);
                //println(mobile);
                insertData(tableName, name, age, mobile);
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tableName = editText2.getText().toString();
                selectData(tableName);
            }
        });



    }// onCreate

    // 데이터베이스를 생성하거나 열어주는 메소드로 우리가 새로 구성한다.
    public void createDatabase(String databaseName){

        //진행상황을 로깅하기 위한 메소드로 이 메소드도 우리가 직접 구성하고 호출하자.
        println("데이터베이스열기/생성 호출됨");
        //데이터베이스 열기또는생성을 위한 메소드 oepnOrCreateDatabase()
        //첫번째 피러미터는 데이터베이스이름, 작성모드,커서팩토리는 null로 한다.
        // db를 생성하거나 열고 database로 받는다.
        database = openOrCreateDatabase(databaseName, MODE_PRIVATE, null);
        // database 가 null이 아니면
        if(database != null ) {
            println("데이터베이스가 오픈되었습니다.");
        }
    }

    public void createTable(String tableName){
        // 테이블 생성
        println("테이블생성 호출");

        // 테이블 생성 전, 먼저 데이터베이스가 열려있는지 테스트하여 열려있으면 테이블 생성을 한다.
        // 동작시 반드시 데이터베이스생성(열기)를 한번 실행 시킨 후, 테이블 생성 작업을 진행한다.
        if(database != null ) {
            // 테이블이 존재하지 않으면 테이블을 만들도록 sql문을 구성함
            String sql = " create table if not exists  "
                    + tableName
                    + "( _id integer PRIMARY KEY autoincrement, Name text, Age integer, Mobile text)";
            // 결과값을 받지 않아도 되는 SQL 구문은 execSQL()로 실행
            database.execSQL(sql);
            println("테이블 생성되었습니다.");
        }else {
            println("데이터베이스를 먼저 오픈해주세요.");
        }
        println("테이블생성 완료!!");
    }

    // 데이터 입력 처리를 위한 메소드
    // 테이블 속성명 충돌을 피하기 위해 패러미터에는 p접두사를 붙여봤습니다. 그런데 이것이 원인은 아니었고...
    // sql 구문구성하며 ' '가 필요했었던 것... 아무튼 패러미터로 넘어온 것 그대로 둠.
    public void insertData(String tableName, String pname, int page, String pmobile){
        println("데이터입력 호출됨");
        // 데이터베이스가 열려 있을 때 인서트를 실행
        if(database != null) {
            // sql 구문을 구성할 때 최종 sql문을 생각하자.
            // pname, mobile 등이 문자열 값이라서 작은 따옴표 '' 로 양쪽을 묶어줘야... 잘 넘어가요.
            // 이거 찾느라 몇시간 허비하였네요. 보통 문자열 변수인 경우 '' 없이 처리했는데 여기서는 걸렸어요.

            String sql = "insert into " + tableName + "(Name, Age, Mobile) values ('" + pname + "', " + page + ", '" + pmobile + "')";
            database.execSQL(sql);
            //String sql = "insert into " + tableName + "(name, age, mobile) values (?, ?, ?)";
            // param로 넘기는 방법이 '' 문제로 적용이 안되었어요. 그래서 코멘트 처리함.
            //Object[] params = {name, age, mobile};
            //database.execSQL(sql, params);
        }else {
            println("먼저 데이터베이스를 오픈하세요");
        }
        println("데이터입력 완료!!");

    }

    // 데이터 조회를 위한 메소드
    public void selectData(String tableName){
        println("테이터 조회 호출됨");
        if(database != null){
            String sql = "select Name, Age, Mobile from " + tableName;
            Cursor cursor = database.rawQuery(sql, null);

            for(int i=0; i < cursor.getCount(); i++){
                cursor.moveToNext();
                String name = cursor.getString(0);
                int age = cursor.getInt(1);
                String mobile = cursor.getString(2);
                println("#"+ i + " : " + name + "," + age+ "," + mobile );
            }
            cursor.close();
        }else {
            println("먼저 데이터베이스를 오픈하세요");
        }
        println("데이터조회 완료!!");
    }

    // 메시지 출력용으로 우리가 직접 구성하는 ㅁ소드
    public void println(String data){
        textView.append(data + "\n");
    }
}// MainActivity
