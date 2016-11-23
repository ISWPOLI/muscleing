package com.example.cristian.muscleregistrationylogin;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends Activity {

    DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final Button bAt = (Button) findViewById(R.id.bAtras);

        bAt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerIntent1 = new Intent(RegisterActivity.this, LoginActivity.class);
                RegisterActivity.this.startActivity(registerIntent1);
            }
        });
    }

    public void onSingUpClick(View v){
        if(v.getId()==R.id.bRegistro) {


            EditText etNombre = (EditText) findViewById(R.id.etNombre);
            EditText etUsuario = (EditText) findViewById(R.id.etUsuario);
            EditText etContraseña = (EditText) findViewById(R.id.etContraseña);
            EditText etContraseña1=(EditText)findViewById(R.id.etContraseña1);
            EditText etEdad = (EditText) findViewById(R.id.etEdad);
            EditText etPeso = (EditText) findViewById(R.id.etPeso);
            EditText etAltura = (EditText) findViewById(R.id.etAltura);
            EditText etTelefono = (EditText) findViewById(R.id.etTelefono);
            Button bRegistro = (Button) findViewById(R.id.bRegistro);


            String namestr = etNombre.getText().toString();
            String usernamestr = etUsuario.getText().toString();
            String passstr = etContraseña.getText().toString();
            String pass1str = etContraseña1.getText().toString();
            String agestr = etEdad.getText().toString();
            String weigthstr = etPeso.getText().toString();
            String heigthstr = etAltura.getText().toString();
            String telstr = etTelefono.getText().toString();


            if(!passstr.equals(pass1str) ){

                Toast pass = Toast.makeText(RegisterActivity.this,"Las contraseñas no son iguales", Toast.LENGTH_SHORT);
                pass.show();
            }else{
                //inserar la infromacion en la base de datos

                Contact c = new Contact();
                c.setName(namestr);
                c.setUsername(usernamestr);
                c.setPass(passstr);
                c.setAge(agestr);
                c.setWeigth(weigthstr);
                c.setHeght(heigthstr);
                c.setTel(telstr);

                helper.insertContact(c);

                Toast pass = Toast.makeText(RegisterActivity.this,"Ya estas registrado, pulsa atras para inciar seción", Toast.LENGTH_SHORT);
                pass.show();


            }

        }
    }
}