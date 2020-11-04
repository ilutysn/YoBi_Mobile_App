package com.tugas.yobimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    Handler handler_for_mainmenu;
    Handler handler_for_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        ImageView imageAnim = (ImageView) findViewById(R.id.splash_logo);
        handler_for_mainmenu = new Handler();
        handler_for_logo = new Handler();
        handler_for_logo.postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        imageAnim.setVisibility(1);
                    }
                }, 800

        );


        handler_for_mainmenu.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);

    }
}