package com.example.cristian.muscleregistrationylogin;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {


    DataBaseHelper helper = new DataBaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    // NO IDEA----------------------------------
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
    }*/


    public void onButtonClick(View v) {



            if (v.getId() == R.id.bIncio) {

                EditText a = (EditText) findViewById(R.id.etUsuario);
                String str = a.getText().toString();

                EditText b = (EditText) findViewById(R.id.etContraseña);
                String pass = b.getText().toString();

                String password = helper.searchPass(str);


                if (pass.equals(password)) {
                    Intent i = new Intent(LoginActivity.this, UserAreaActivity.class);

                    startActivity(i);
                } else {
                    Toast temp = Toast.makeText(LoginActivity.this, "El usuario o la contraseña son incorrectos", Toast.LENGTH_SHORT);
                    temp.show();
                }
                // aqui se elije hacia a donde quiere que vaya despues de oprimir inicip

            }
        if (v.getId() == R.id.tvRegistro) {

            Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(i);
        }
    }
}