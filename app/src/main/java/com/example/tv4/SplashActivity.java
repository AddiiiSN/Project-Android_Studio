package com.example.tv4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

    // Waktu delay untuk splash screen (dalam milidetik)
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            // Menjalankan kode setelah waktu delay habis
            @Override
            public void run() {
                // Intent untuk memulai MainActivity
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);

                // Menutup SplashActivity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
