package com.example.cjgreen.cafenow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OrderConfirmActivity extends AppCompatActivity {

    Button btnHome;
    Button btnPre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderconfirm);

        final Button btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "별점이 등록되었습니다.",Toast.LENGTH_SHORT).show();
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

        //Pre 버튼 클릭시 ordercomplete로 이동
        btnPre = (Button)findViewById(R.id.btnPre);
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),OrderCompleteActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}