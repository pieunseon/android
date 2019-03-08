package com.example.cjgreen.cafenow_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OrderConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderconfirm);

        //확인 버튼 변수
        final Button btn1 = (Button) findViewById(R.id.btnSave);

        //버튼 클릭 이벤트 처리
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "별점이 등록되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
