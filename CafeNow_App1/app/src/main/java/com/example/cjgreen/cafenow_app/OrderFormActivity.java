package com.example.cjgreen.cafenow_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OrderFormActivity extends AppCompatActivity {

    Button btnShop1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderform);

        //shop1 버튼 클릭시

        btnShop1 = (Button) findViewById(R.id.btnShop1);
        btnShop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_orderprocess = new Intent(getApplicationContext(), OrderProcessActivity.class);
                startActivity(intent_orderprocess);
                finish();
            }
        });
        /*
        btnShop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_orderprocess = new Intent(getApplicationContext(), OrderProcessActivity.class);
                startActivity(intent_orderprocess);
                finish();
            }
        });
        */


        //확인 버튼 변수
        final Button btn1 = (Button) findViewById(R.id.btnBasket);

        //버튼 클릭 이벤트 처리
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "보관함으로 이동했습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
