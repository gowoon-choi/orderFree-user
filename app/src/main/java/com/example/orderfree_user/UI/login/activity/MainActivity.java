package com.example.orderfree_user.UI.login.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.orderfree_user.R;

public class MainActivity extends AppCompatActivity {
    private Button mQRscanButton;
    private Button mOrderListButton;
    private Button mSellStatusButton;
    private Button mPersonInfoButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mUserNameView = (TextView)findViewById(R.id.userName);
        mQRscanButton = (Button)findViewById(R.id.QRcode_scan);
        mOrderListButton = (Button)findViewById(R.id.main_orderlist);
        mSellStatusButton = (Button)findViewById(R.id.main_sellstatus);
        mPersonInfoButton = (Button)findViewById(R.id.main_person_info);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");

        if(intent.hasExtra("userName")) {
            mUserNameView.setText(userName);
        }

        //QR코드 스캔 버튼 클릭시 QRScannerActivity로 이동
        mQRscanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.example.orderfree_user.UI.mainview.activity.QRScannerActivity.class);
                startActivity(intent);
            }
        });

        mOrderListButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            }
        });

        mSellStatusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        mPersonInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mPref = getSharedPreferences("autoLoginRecord",MODE_PRIVATE);
                Boolean autoLoginCheck = mPref.getBoolean("autoLoginCheck",false);

                /**Intent intent = new Intent(getApplicationContext(), com.example.orderfree_user.UI.mainview.activity.personInfoActivity.class);
                if(autoLoginCheck==false){// 자동로그인이 체크되어 있지 않거나 로그인이 첫번째인 경우는 기존에 전달받은 이름을 사용
                    intent.putExtra("userName",userName);
                    startActivity(intent);
                }else{ //자동로그인이 체크되어있는 경우 SharedPreferences에서 이름 가져오면 됨
                    String userName = mPref.getString("userName",null);
                    intent.putExtra("userName",userName);
                    startActivity(intent);
                }**/

            }
        });
    }
}
