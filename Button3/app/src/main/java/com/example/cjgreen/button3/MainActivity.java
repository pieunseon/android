package com.example.cjgreen.button3;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //ICE HOT 버튼
    Button btnIce1;
    Button btnHot1;

    //보관하기, 주문하기 버튼
    Button btnCabinet;
    Button btnOrder1;

    Button btnPlus1;
    Button btnMinus1;

    int count1=0;
    TextView countText1=null;

    //+ -  수량 버튼
    /*
    TextView countText[] = null;
    Button btnPlus[] = null;
    Button btnMinus[] = null;
    int btnPlusId[] = {R.id.btnPlus1,R.id.btnPlus2,R.id.btnPlus3,R.id.btnPlus4};
    int btnMinusId[] = {R.id.btnMinus1,R.id.btnMinus2,R.id.btnMinus3,R.id.btnMinus4};
    int countTextId[] = {R.id.count1,R.id.count2,R.id.count3,R.id.count4};
    int count[] = {0};
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();     //????
    }

    private void setup() {

        /*
        for (int i = 0; i < btnPlusId.length; i++) {
            btnPlus[i] = (Button) findViewById(btnPlusId[i]);
            btnPlus[i].setOnClickListener(listener);

        }

        for (int i=0; i < btnMinusId.length; i--) {
                btnMinus[i] = (Button) findViewById(btnMinusId[i]);
                btnMinus[i].setOnClickListener(listener);
        }

        for (int i=0; i < countTextId.length; i--) {
            countText[i] = (TextView) findViewById(countTextId[i]);

        }*/

       // count = (TextView)findViewById(R.id.count1);
        btnPlus1 = (Button) findViewById(R.id.btnPlus1);
        btnPlus1.setOnClickListener(listener);

        btnMinus1 = (Button) findViewById(R.id.btnMinus1);
        btnMinus1.setOnClickListener(listener);

        countText1 = (TextView)findViewById(R.id.count1);



    }

    View.OnClickListener listener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btnPlus1 :
                    count1++;
                    if(count1 >= 10)
                        count1 = 10;
                    countText1.setText(""+count1);
                    break;
                case R.id.btnMinus1 :
                    count1--;
                    if(count1<=0)
                        count1 = 0;
                    countText1.setText(""+count1);
                    break;
            }
            /*
           // Toast.makeText(getApplicationContext(), "가 검색되었습니다.",Toast.LENGTH_SHORT).show();
            for (int i=0; i<btnPlusId.length; i++){
                if (v.getId()==btnPlusId[i]){
                    count[i]++;
                    if(count[i] >= 10)
                        count[i] = 10;
                    countText[i].setText(""+count[i]);


                }
            }
            switch (v.getId()) {
                case R.id.btnPlus1 :
                    count++;
                    if(count >= 10)
                        count = 10;
                    count1.setText(""+count);
                    break;
                case R.id.btnMinus1 :
                    count--;
                    if(count<=0)
                        count = 0;
                    count1.setText(""+count);
                    break;
            }*/


        }
    };

}