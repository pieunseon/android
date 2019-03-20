package com.example.cjgreen.cafenow;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OrderProcessActivity extends AppCompatActivity {

    Button btnPay;
    Button btnPhone;
    Button btnCard;
    Button btnHome;
    Button btnPre;

    int temp[] = {0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderprocess);

        //final int temp[] = {0};

        btnCard = (Button) findViewById(R.id.btnCard);
        btnPhone = (Button) findViewById(R.id.btnPhone);


        // 카드 결제,휴대폰 결제 버튼
        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp[0] == 0) {
                    btnCard.setBackgroundColor(Color.rgb(255, 255, 255));
                    btnCard.setTextColor(Color.rgb(21, 67, 96));
                    btnPhone.setBackgroundColor(Color.rgb(21, 67, 96));
                    btnPhone.setTextColor(Color.rgb(255, 255, 255));
                    btnCard.setBackgroundResource(R.drawable.btn_bg_ex);
                    Toast.makeText(getApplicationContext(), "휴대폰 결제를 선택했습니다.",Toast.LENGTH_SHORT).show();
                    temp[0] = 1;
                }
            }
        });

        btnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp[0] == 1) {

                    btnPhone.setBackgroundColor(Color.rgb(255, 255, 255));
                    btnPhone.setTextColor(Color.rgb(21, 67, 96));
                    btnPhone.setBackgroundResource(R.drawable.btn_bg_ex);
                    btnCard.setBackgroundColor(Color.rgb(21, 67, 96));
                    btnCard.setTextColor(Color.rgb(255, 255, 255));
                    Toast.makeText(getApplicationContext(), "카드 결제를 선택했습니다.",Toast.LENGTH_SHORT).show();

                    temp[0] = 0;
                }
            }
        });


        /*
        //신용카드 버튼 변수
        final Button btnCard = (Button) findViewById(R.id.btnCard);
        //휴대폰 결제 버튼 변수
        final Button btnPhone = (Button) findViewById(R.id.btnPhone);

        //신용카드 버튼 클릭 이벤트 처리
        btnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "카드결제를 선택했습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        //휴대폰 결제 버튼 클릭 이벤트 처리
        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "휴대폰 결제를 선택했습니다.",Toast.LENGTH_SHORT).show();
            }
        });

       */


        //결제하기 버튼 클릭 시 ordercomplete로 이동
        Button btnPay = (Button) findViewById(R.id.btnPay);
        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), OrderCompleteActivity.class);
                startActivity(intent1);
                finish();
            }
        });

        //HOME 버튼 클릭시 search로 이동
        btnHome = (Button)findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),SearchActivity.class);
                startActivity(intent1);
                finish();
            }
        });

        //Pre 버튼 클릭시 orderprocess로 이동
        btnPre = (Button)findViewById(R.id.btnPre);
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),OrderFormActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}
