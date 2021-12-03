package com.itcube.ekzamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    private int time_loading = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(SplashScreen.this, SignUpScreen.class);
                startActivity(home);
                finish();
            }
        }, time_loading);
    }
}