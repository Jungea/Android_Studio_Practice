package com.example.jungea.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {
        Toast.makeText(getApplicationContext(), "시작버튼이 눌렸어요", Toast.LENGTH_LONG).show();
        //잠깐 보였다가 없어지는 메세지 표시
    }
}
