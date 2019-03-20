package com.example.cjgreen.cafenow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    Button btnShop1;
    Button btnShop2;
    Button btnShop3;
    Button btnShop4;
    Button btnShop5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);


        // Shop1 버튼 클릭시 orderform으로 이동
        btnShop1 = (Button) findViewById(R.id.btnShop1);
        btnShop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), OrderFormActivity.class);
                startActivity(intent1);
                finish();
            }
        });

        // Shop2 버튼 클릭시 orderformsecond으로 이동
        btnShop2 = (Button) findViewById(R.id.btnShop2);
        btnShop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), OrderFormSecondActivity.class);
                startActivity(intent2);
                finish();
            }
        });

        // Shop3 버튼 클릭시 orderformthird으로 이동
        btnShop3 = (Button) findViewById(R.id.btnShop3);
        btnShop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), OrderFormThirdActivity.class);
                startActivity(intent3);
                finish();
            }
        });

        // Shop4 버튼 클릭시 orderformfourth으로 이동
        btnShop4 = (Button) findViewById(R.id.btnShop4);
        btnShop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), OrderFormFourthActivity.class);
                startActivity(intent4);
                finish();
            }
        });

        // Shop5 버튼 클릭시 orderformfifth으로 이동
        btnShop5 = (Button) findViewById(R.id.btnShop5);
        btnShop5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(), OrderFormFifthActivity.class);
                startActivity(intent5);
                finish();
            }
        });



        //체크박스 변수
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.check1);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.check2);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.check3);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.check4);
        final CheckBox checkBox5 = (CheckBox) findViewById(R.id.check5);

        //텍스트뷰 변수
        //버튼 변수
        final ImageButton btn1 = (ImageButton) findViewById(R.id.btnSearch);
        final TextView text1 = (TextView) findViewById(R.id.autoCompleteTextView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), text1.getText()+"가 검색되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "즐겨찾기 추가되었습니다.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "즐겨찾기 삭제되었습니다.",Toast.LENGTH_SHORT).show();
                }

            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "즐겨찾기 추가되었습니다.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "즐겨찾기 삭제되었습니다.",Toast.LENGTH_SHORT).show();
                }

            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "즐겨찾기 추가되었습니다.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "즐겨찾기 삭제되었습니다.",Toast.LENGTH_SHORT).show();
                }

            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox4.isChecked()) {
                    Toast.makeText(getApplicationContext(), "즐겨찾기 추가되었습니다.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "즐겨찾기 삭제되었습니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox5.isChecked()) {
                    Toast.makeText(getApplicationContext(), "즐겨찾기 추가되었습니다.",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "즐겨찾기 삭제되었습니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
