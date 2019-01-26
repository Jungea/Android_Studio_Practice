package com.example.jungea.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onBackButtonClicked(View v) {
        Toast.makeText(this, "돌아가기 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();

        finish();  //MenuActivity 화면 없애줌.(쌓이는 형식?)
    }
}
