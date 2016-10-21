package com.example.cristian.muscleregistrationylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final Button bAlergias = (Button) findViewById(R.id.bAlergias);





        bAlergias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent UserAIntent2 = new Intent(UserAreaActivity.this, UserAreaActivity2.class);
                UserAreaActivity.this.startActivity(UserAIntent2);
            }
        });






    }
}
