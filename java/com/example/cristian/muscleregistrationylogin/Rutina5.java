package com.example.cristian.muscleregistrationylogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Rutina5 extends AppCompatActivity {

    ListView listView;
    int[] runtine_poster_resource={R.drawable.appicon,
            R.drawable.push, R.drawable.fondospecho,R.drawable.pechoinclinado,R.drawable.pesspecho,R.drawable.correr,

            R.drawable.appicon,R.drawable.presspierna, R.drawable.sentadilla,R.drawable.pesomuerto,R.drawable.extenciones,R.drawable.correr,

            R.drawable.appicon,R.drawable.copa, R.drawable.rompecocos,R.drawable.triceps,R.drawable.bicicleta,

            R.drawable.appicon,R.drawable.hombro, R.drawable.biceps,R.drawable.hombro2,R.drawable.biceps2,R.drawable.abdomen,

            R.drawable.appicon,R.drawable.barras, R.drawable.remoespalda,R.drawable.barraespalda,R.drawable.abdomen,


    };
    String[] rutine_titles;
    String[] rutine_reps;
    RutineAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina5);
        listView = (ListView)findViewById(R.id.list_view);
         rutine_reps= getResources().getStringArray(R.array.rutine_reps);
        rutine_titles= getResources().getStringArray(R.array.rutine_titles);


        int i = 0;
        adapter= new RutineAdapter(getApplicationContext(),R.layout.row_layout12);
        listView.setAdapter(adapter);
        for(String titles: rutine_titles){
            ProveedorDeRutinas proveedor = new ProveedorDeRutinas(runtine_poster_resource[i],titles, rutine_reps[i]);

            adapter.add(proveedor);

            i++;
        }

    }
}
