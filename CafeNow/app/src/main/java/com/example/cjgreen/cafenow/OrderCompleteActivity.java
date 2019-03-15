package com.example.cjgreen.cafenow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderCompleteActivity extends AppCompatActivity {

    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordercomplete);

        //주문내역 확인 버튼 누를시 OrderConfirm 으로 이동
        btnConfirm = (Button) findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),OrderConfirmActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}