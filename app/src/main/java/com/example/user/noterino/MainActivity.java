package com.example.user.noterino;

import android.content.Intent;
//import android.graphics.Color;
//import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.MotionEvent;
//import android.view.View;
//import android.widget.Toast;

//import com.budiyev.android.circularprogressbar.CircularProgressBar;

public class MainActivity extends AppCompatActivity {

    //private CircularProgressBar cpb;

    /**
    Handler handler = new Handler();
    Runnable run = new Runnable() {
        public void run() {
            Toast.makeText(MainActivity.this, "Pressed for at least 1.5 seconds",
            Toast.LENGTH_LONG).show();
            Intent i = new Intent(MainActivity.this, Result.class);
            startActivity(i);
        }
    };
     **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cpb = findViewById(R.id.progress_bar);

/**
        cpb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        cpb.setIndeterminate(true);
                        cpb.setIndeterminateMinimumAngle(0);
                        cpb.setIndeterminateRotationAnimationDuration(2000);
                        cpb.setIndeterminateSweepAnimationDuration(2000);
                        cpb.setBackgroundStrokeColor(Color.parseColor("#7D7D7D"));
                        cpb.setForegroundStrokeColor(Color.parseColor("#CCCCCC"));

                        handler.postDelayed(run, 1500);

                        break;
                    case MotionEvent.ACTION_UP:
                        cpb.setIndeterminate(false);
                        cpb.setBackgroundStrokeColor(Color.parseColor("#CCCCCC"));
                        cpb.setForegroundStrokeColor(Color.parseColor("#7D7D7D"));
                        handler.removeCallbacks(run);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
**/
    }
}
    /*
    @Override
    public boolean onTouch(View arg0, MotionEvent arg1) {
        // Activate circle progress bar animation around End Button when it is touched (press and hold)
        switch (arg1.getAction()) {
            case MotionEvent.ACTION_DOWN:
                int animationDuration = 2000;
                endCircleProgressBar.setProgress(0);
                endCircleProgressBar.setProgressWithAnimation(100, animationDuration);
                endCircleProgressBar.setBackgroundProgressColor(Color.LTGRAY);

                handler.postDelayed(run, 2000);
                break;

            case MotionEvent.ACTION_UP:
                animationDuration = 1000;
                endCircleProgressBar.setClockwise(false);
                endCircleProgressBar.setProgressWithAnimation(0, animationDuration);
                endCircleProgressBar.setBackgroundProgressColor(Color.LTGRAY);

                handler.removeCallbacks(run);
                break;
            default:
                handler.removeCallbacks(run);
                break;
        }

        return true;
    }
    */
