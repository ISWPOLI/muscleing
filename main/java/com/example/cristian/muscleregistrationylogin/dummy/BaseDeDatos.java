package com.example.cristian.muscleregistrationylogin.dummy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Yeison Fernando on 26/09/2016.
 */

public class BaseDeDatos extends SQLiteOpenHelper {

    private static final String DB_Name = "Datos";
    private static final int Version = 1;
    private SQLiteDatabase db;

    public Tablas getT() {
        return t;
    }

    public void setT(Tablas t) {
        this.t = t;
    }

    private Tablas t;


    public BaseDeDatos(Context context) {
        super(context, DB_Name, null , Version);
        db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Tablas.TABLE_NAME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,int newVersion){

    }
}
