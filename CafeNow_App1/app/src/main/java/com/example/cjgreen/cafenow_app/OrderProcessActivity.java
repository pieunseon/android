package com.example.cjgreen.cafenow_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OrderProcessActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderprocess);

        //신용카드 버튼 변수
        final Button btn1 = (Button) findViewById(R.id.btnCard);

        //휴대폰 결제 버튼 변수
        final Button btn2 = (Button) findViewById(R.id.btnPhone);


        //신용카드 버튼 클릭 이벤트 처리
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "카드결제를 선택했습니다.",Toast.LENGTH_SHORT).show();
            }
        });


        //휴대폰 결제 버튼 클릭 이벤트 처리
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "휴대폰 결제를 선택했습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
