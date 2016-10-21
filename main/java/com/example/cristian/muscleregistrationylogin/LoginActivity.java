package com.example.cristian.muscleregistrationylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsuario = (EditText) findViewById(R.id.etUsuario);
        final EditText etContraseña = (EditText) findViewById(R.id.etContraseña);
        final Button bInicio = (Button) findViewById(R.id.bIncio);
        final TextView tvRegistro = (TextView) findViewById(R.id.tvRegistro);

        tvRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
            });

        bInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent UserAreaIntent = new Intent(LoginActivity.this, Select3.class);
                LoginActivity.this.startActivity(UserAreaIntent);
            }
        });













        }
    }

