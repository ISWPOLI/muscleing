package com.example.cristian.muscleregistrationylogin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Cristian on 14/11/2016.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME= "contacts.db";
    private static final String TABLE_NAME= "contacts";
    private static final String COLUM_ID="id";
    private static final String COLUM_NAME="name";
    private static final String COLUM_USERNAME="username";
    private static final String COLUM_PASS="pass";
    private static final String COLUM_AGE="age";
    private static final String COLUM_WEIGTH="weigth";
    private static final String COLUM_HEIGHT="height";
    private static final String COLUM_TEL="tel";

    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table contacts(id integer primary key not null , "+
            "name text not null, username text not null, pass text not null, age text not null, weigth text not null, height text not null, tel text not null);";

    public DataBaseHelper(Context context){
        super(context , DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    //String name,username,pass,age,weigth,height,tel;
    public void insertContact(Contact c){

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from contacts";
        Cursor cursor = db.rawQuery(query , null);

        int count = cursor.getCount();

        values.put(COLUM_ID, count);
        values.put(COLUM_NAME, c.getName());
        values.put(COLUM_USERNAME, c.getUsername());
        values.put(COLUM_PASS, c.getPass());
        values.put(COLUM_AGE, c.getAge());
        values.put(COLUM_WEIGTH, c.getWeigth());
        values.put(COLUM_HEIGHT, c.getHeght());
        values.put(COLUM_TEL, c.getTel());

        db.insert(TABLE_NAME, null,values);
        db.close();

    }



    public String searchPass(String username){
        db = this.getReadableDatabase();
        String query = "select username, pass from "+ TABLE_NAME;
        Cursor cursor = db.rawQuery(query , null);
        String a, b;
        b = "not found";
        if(cursor.moveToFirst()){

            do{
                a=cursor.getString(0);
                b = cursor.getString(1);
                if(a.equals(username)){
                    b = cursor.getString(1);
                    break;
                }
            }while(cursor.moveToNext());
        }
        return b;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String query = "DROP TABLE IF EXISTS" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }
}
