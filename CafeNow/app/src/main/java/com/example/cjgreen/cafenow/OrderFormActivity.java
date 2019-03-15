package com.example.cjgreen.cafenow;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderFormActivity extends AppCompatActivity {

    Button btnCabinet;
    Button btnOrder1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderform);


        //주문하기 버튼 클릭시 orderprocess로 이동
        btnOrder1 = (Button) findViewById(R.id.btnOrder1);
        btnOrder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), OrderProcessActivity.class);
                startActivity(intent1);
                finish();
            }
        });

        //보관하기 버튼 클릭시 cabinet로 이동
        btnCabinet = (Button) findViewById(R.id.btnCabinet);
        btnCabinet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),CabinetActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }
}