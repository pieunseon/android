package com.example.cjgreen.cafenow;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderFormFourthActivity extends AppCompatActivity{

    //ICE HOT 버튼
    Button btnIce1;
    Button btnHot1;

    Button btnIce2;
    Button btnHot2;

    Button btnIce3;
    Button btnHot3;

    Button btnIce4;
    Button btnHot4;


    //보관하기,주문하기 버튼
    Button btnCabinet;
    Button btnOrder1;


    //수량 버튼
    Button btnPlus1;
    Button btnMinus1;

    Button btnPlus2;
    Button btnMinus2;

    Button btnPlus3;
    Button btnMinus3;

    Button btnPlus4;
    Button btnMinus4;

    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;

    TextView countText1 = null;
    TextView countText2 = null;
    TextView countText3 = null;
    TextView countText4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderformfourth);
        setup();

        final int temp[] = {0,0,0,0};

        btnIce1 = (Button) findViewById(R.id.btnIce1);
        btnHot1 = (Button) findViewById(R.id.btnHot1);
        btnIce2 = (Button) findViewById(R.id.btnIce2);
        btnHot2 = (Button) findViewById(R.id.btnHot2);
        btnIce3 = (Button) findViewById(R.id.btnIce3);
        btnHot3 = (Button) findViewById(R.id.btnHot3);
        btnIce4 = (Button) findViewById(R.id.btnIce4);
        btnHot4 = (Button) findViewById(R.id.btnHot4);

        //ice, hot 버튼 클릭 이벤트
        // ice1,hot1
        btnHot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp[0] == 0) {
                    btnIce1.setBackgroundColor(Color.rgb(255, 255, 255));
                    btnIce1.setTextColor(Color.rgb(21, 67, 96));
                    btnHot1.setBackgroundColor(Color.rgb(21, 67, 96));
                    btnHot1.setTextColor(Color.rgb(255, 255, 255));
                    btnIce1.setBackgroundResource(R.drawable.btn_bg_ex);
                    temp[0] = 1;
                }
            }
        });

        btnIce1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp[0] == 1) {

                    btnHot1.setBackgroundColor(Color.rgb(255, 255, 255));
                    btnHot1.setTextColor(Color.rgb(21, 67, 96));
                    btnHot1.setBackgroundResource(R.drawable.btn_bg_ex);
                    btnIce1.setBackgroundColor(Color.rgb(21, 67, 96));
                    btnIce1.setTextColor(Color.rgb(255, 255, 255));

                    temp[0] = 0;
                }
            }
        });

        // ice2,hot2
        btnHot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp[1] == 0) {
                    btnIce2.setBackgroundColor(Color.rgb(255, 255, 255));
                    btnIce2.setTextColor(Color.rgb(21, 67, 96));
                    btnHot2.setBackgroundColor(Color.rgb(21, 67, 96));
                    btnHot2.setTextColor(Color.rgb(255, 255, 255));
                    btnIce2.setBackgroundResource(R.drawable.btn_bg_ex);
                    temp[1] = 1;
                }
            }
        });

        btnIce2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp[1] == 1) {

                    btnHot2.setBackgroundColor(Color.rgb(255, 255, 255));
                    btnHot2.setTextColor(Color.rgb(21, 67, 96));
                    btnHot2.setBackgroundResource(R.drawable.btn_bg_ex);
                    btnIce2.setBackgroundColor(Color.rgb(21, 67, 96));
                    btnIce2.setTextColor(Color.rgb(255, 255, 255));

                    temp[1] = 0;
                }
            }
        });


        // ice3,hot3
        btnHot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp[2] == 0) {
                    btnIce3.setBackgroundColor(Color.rgb(255, 255, 255));
                    btnIce3.setTextColor(Color.rgb(21, 67, 96));
                    btnHot3.setBackgroundColor(Color.rgb(21, 67, 96));
                    btnHot3.setTextColor(Color.rgb(255, 255, 255));
                    btnIce3.setBackgroundResource(R.drawable.btn_bg_ex);
                    temp[2] = 1;
                }
            }
        });

        btnIce3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp[2] == 1) {

                    btnHot3.setBackgroundColor(Color.rgb(255, 255, 255));
                    btnHot3.setTextColor(Color.rgb(21, 67, 96));
                    btnHot3.setBackgroundResource(R.drawable.btn_bg_ex);
                    btnIce3.setBackgroundColor(Color.rgb(21, 67, 96));
                    btnIce3.setTextColor(Color.rgb(255, 255, 255));

                    temp[2] = 0;
                }
            }
        });

        // ice4,hot4
        btnHot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp[3] == 0) {
                    btnIce4.setBackgroundColor(Color.rgb(255, 255, 255));
                    btnIce4.setTextColor(Color.rgb(21, 67, 96));
                    btnHot4.setBackgroundColor(Color.rgb(21, 67, 96));
                    btnHot4.setTextColor(Color.rgb(255, 255, 255));
                    btnIce4.setBackgroundResource(R.drawable.btn_bg_ex);
                    temp[3] = 1;
                }
            }
        });

        btnIce4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp[3] == 1) {

                    btnHot4.setBackgroundColor(Color.rgb(255, 255, 255));
                    btnHot4.setTextColor(Color.rgb(21, 67, 96));
                    btnHot4.setBackgroundResource(R.drawable.btn_bg_ex);
                    btnIce4.setBackgroundColor(Color.rgb(21, 67, 96));
                    btnIce4.setTextColor(Color.rgb(255, 255, 255));

                    temp[3] = 0;
                }
            }
        });


        //주문하기 버튼 클릭시 orderprocess로 이동
        btnOrder1 = (Button) findViewById(R.id.btnOrder1);
        btnOrder1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), OrderProcessActivity.class);
                startActivity(intent1);
                finish();
            }
        });

        //보관하기 버튼 클릭시 cabinet로 이동
        btnCabinet = (Button) findViewById(R.id.btnCabinet);
        btnCabinet.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), CabinetActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }


    // + , -  버튼 클릭 이벤트. 클릭시 수량 1씩 증가
    private void setup() {
        btnPlus1 = (Button) findViewById(R.id.btnPlus1);
        btnPlus1.setOnClickListener(listener);

        btnMinus1 = (Button) findViewById(R.id.btnMinus1);
        btnMinus1.setOnClickListener(listener);

        countText1 = (TextView)findViewById(R.id.count1);

        //
        btnPlus2 = (Button) findViewById(R.id.btnPlus2);
        btnPlus2.setOnClickListener(listener2);

        btnMinus2 = (Button) findViewById(R.id.btnMinus2);
        btnMinus2.setOnClickListener(listener2);

        countText2 = (TextView)findViewById(R.id.count2);

        //
        btnPlus3 = (Button) findViewById(R.id.btnPlus3);
        btnPlus3.setOnClickListener(listener3);

        btnMinus3 = (Button) findViewById(R.id.btnMinus3);
        btnMinus3.setOnClickListener(listener3);

        countText3 = (TextView)findViewById(R.id.count3);

        //
        btnPlus4 = (Button) findViewById(R.id.btnPlus4);
        btnPlus4.setOnClickListener(listener4);

        btnMinus4 = (Button) findViewById(R.id.btnMinus4);
        btnMinus4.setOnClickListener(listener4);

        countText4 = (TextView)findViewById(R.id.count4);
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
        }
    };


    View.OnClickListener listener2 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btnPlus2 :
                    count2++;
                    if(count2 >= 10)
                        count2 = 10;
                    countText2.setText(""+count2);
                    break;
                case R.id.btnMinus2 :
                    count2--;
                    if(count2<=0)
                        count2 = 0;
                    countText2.setText(""+count2);
                    break;
            }
        }
    };

    View.OnClickListener listener3 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btnPlus3 :
                    count3++;
                    if(count3 >= 10)
                        count3 = 10;
                    countText3.setText(""+count3);
                    break;
                case R.id.btnMinus3 :
                    count3--;
                    if(count3<=0)
                        count3 = 0;
                    countText3.setText(""+count3);
                    break;
            }
        }
    };

    View.OnClickListener listener4 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btnPlus4 :
                    count4++;
                    if(count4 >= 10)
                        count4 = 10;
                    countText4.setText(""+count4);
                    break;
                case R.id.btnMinus4 :
                    count4--;
                    if(count4<=0)
                        count4 = 0;
                    countText4.setText(""+count4);
                    break;
            }
        }
    };


}
