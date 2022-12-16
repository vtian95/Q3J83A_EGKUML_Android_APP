package com.example.beadando_mobil_02.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;

public class DATABASE extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "notebook.db";
    SQLiteDatabase db;

    public DATABASE(Context context) {
        super(context, DATABASE_NAME, null, 1);
        db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS \"notebook\" (\n" +
                "\t\"id\"\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "\t\"gyarto\"\tTEXT NOT NULL UNIQUE,\n" +
                "\t\"tipus\"\tTEXT NOT NULL,\n" +
                "\t\"ar\"\tTEXT NOT NULL,\n" +
                "\t\"kijelzo\"\tTEXT NOT NULL,\n" +
                "\t\"memoria\"\tTEXT NOT NULL,\n" +
                "\t\"merevlemez\"\tTEXT NOT NULL,\n" +
                "\t\"videovezerlo\"\tTEXT NOT NULL )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
