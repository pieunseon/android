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
