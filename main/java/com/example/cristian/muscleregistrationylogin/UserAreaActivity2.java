package com.example.cristian.muscleregistrationylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserAreaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area2);

        final Button bSiguiente = (Button) findViewById(R.id.bSiguiente);

        bSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent UserAIntent = new Intent(UserAreaActivity2.this, Select3.class);
                UserAreaActivity2.this.startActivity(UserAIntent);
            }
        });

    }
}
