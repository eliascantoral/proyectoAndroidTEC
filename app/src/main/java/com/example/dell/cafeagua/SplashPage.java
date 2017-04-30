package com.example.dell.cafeagua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashPage extends AppCompatActivity {
    SplashPage thisActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);

        thisActivity = this;
        TimerTask mi_primer_timertask = new TimerTask() {
            @Override
            public void run() {
                Intent mi_primer_intent = new Intent(thisActivity, MainActivity.class);
                thisActivity.startActivity(mi_primer_intent);
                thisActivity.finish();
            }
        };
        Timer mi_primer_timer = new Timer();
        mi_primer_timer.schedule(mi_primer_timertask, 3000);
    }
}
