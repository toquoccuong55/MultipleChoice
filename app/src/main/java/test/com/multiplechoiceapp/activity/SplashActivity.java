package test.com.multiplechoiceapp.activity;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import test.com.multiplechoiceapp.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        delaySplashScreen();
    }

    private void delaySplashScreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                HomeActivity.intentToHomeActivity(SplashActivity.this);
            }
        }, 3000);
    }

}
