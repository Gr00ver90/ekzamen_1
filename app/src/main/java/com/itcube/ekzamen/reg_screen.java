package com.itcube.ekzamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reg_screen extends AppCompatActivity implements View.OnClickListener {

Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_screen);

        btn1 = (Button) findViewById(R.id.button_reg);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button_sign);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_reg:
                Intent intent1 = new Intent(reg_screen.this, SignUpScreen.class);
                startActivity(intent1);
                break;
            case R.id.button_sign:
                Intent intent2 = new Intent(reg_screen.this, SignUpScreen.class);
                startActivity(intent2);
                break;

        }
    }
}