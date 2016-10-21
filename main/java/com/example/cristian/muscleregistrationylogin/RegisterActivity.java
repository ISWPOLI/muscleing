package com.example.cristian.muscleregistrationylogin;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.cristian.muscleregistrationylogin.dummy.BaseDeDatos;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class RegisterActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etEdad;
        etEdad = (EditText) findViewById(R.id.etEdad);
        final EditText etNombre;
        etNombre = (EditText) findViewById(R.id.etNombre);
        final EditText etContraseña;
        etContraseña = (EditText) findViewById(R.id.etContraseña);
        final EditText etUsuario;
        etUsuario = (EditText) findViewById(R.id.etUsuario);
        final EditText etPeso;
        etPeso = (EditText) findViewById(R.id.etPeso);
        final EditText etAltura;
        etAltura = (EditText) findViewById(R.id.etAltura);
        final EditText etTelefono;
        etTelefono = (EditText) findViewById(R.id.etTelefono);
        final Button bRegistro;
        bRegistro = (Button) findViewById(R.id.bRegistro);
        final Button etPatologias;
        etPatologias = (Button) findViewById(R.id.bPatologias);
        final Button etConsumo;
        etConsumo = (Button) findViewById(R.id.etConsumo);
        final CheckBox etLesion;
        etLesion = (CheckBox) findViewById(R.id.etLesion);

        bRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regsterActiityIntent = new Intent(RegisterActivity.this, UserAreaActivity.class);
                RegisterActivity.this.startActivity(regsterActiityIntent);
            }
        });
        etConsumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regsterActiityIntent = new Intent(RegisterActivity.this, UserConsumoActivity.class);
                RegisterActivity.this.startActivity(regsterActiityIntent);
                //BaseDeDatos bd = new BaseDeDatos(getBaseContext().getApplicationContext());
                //bd.onCreate(SQLiteDatabase.create());

            }
        });

        etPatologias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regsterActiityIntent = new Intent(RegisterActivity.this,UserPatologiasActivity.class );
                RegisterActivity.this.startActivity(regsterActiityIntent);
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Register Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
