package com.example.cjgreen.cafenow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CabinetActivity extends AppCompatActivity {

    Button btnOrder2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cabinet);

        //선택 주문 버튼 클릭시 orderprocess로 이동
        btnOrder2 = (Button) findViewById(R.id.btnOrder2);
        btnOrder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), OrderProcessActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}