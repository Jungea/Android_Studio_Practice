package com.example.mybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        registerReceiver(br, filter);
    }

    private BroadcastReceiver br = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent.getAction()==Intent.ACTION_SCREEN_ON)
                Toast.makeText(context,"화면ON", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(context,"화면OFF", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(br);
    }

}
