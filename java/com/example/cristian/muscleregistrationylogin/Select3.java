package com.example.cristian.muscleregistrationylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select3 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select3);

        final Button btDieta = (Button) findViewById(R.id.btDieta);
        final Button btRutina = (Button) findViewById(R.id.btRutina);
        final Button btLogros = (Button) findViewById(R.id.btLogros);

        btDieta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerIntent1 = new Intent(Select3.this, Dieta4.class);
                Select3.this.startActivity(registerIntent1);
            }
        });
        btRutina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerIntent2 = new Intent(Select3.this, Rutina5.class);
                Select3.this.startActivity(registerIntent2);
            }
        });

        btLogros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerIntent1 = new Intent(Select3.this, Logros6.class);
                Select3.this.startActivity(registerIntent1);
            }
        });

    }
}
