package com.example.cristian.muscleregistrationylogin;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SpashScreen extends AppCompatActivity {

    ProgressBar prg;
    int progress=0;
    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);


        prg = (ProgressBar) findViewById(R.id.progressBar2);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    progress += 20;
                    h.post(new Runnable() {
                        @Override
                        public void run() {
                            prg.setProgress(progress);
                            if (progress == prg.getMax()) {
                                Intent in = new Intent(getApplicationContext(), LoginActivity.class);
                                startActivity(in);

                            }
                        }
                    });
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        //TODO: handle exception
                    }

                }

            }
        }).start();
    }}
