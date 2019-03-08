package com.example.cjgreen.cafenow_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CabinetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cabinet);

        //체크박스 변수
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkChoice1);

        //삭제 버튼 변수
        final Button btn1 = (Button) findViewById(R.id.btnDelete);

        //삭제버튼 클릭 이벤트 처리
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "삭제되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
