package com.wipro.wicruit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PR391127 on 08/10/2017.
 */

    public class Database extends SQLiteOpenHelper {

        private static final String DATABASE_NAME = "UserDetails.db";
        private static final String TABLE_NAME = "user_table";


        private static final String ID = "ID";
        private static final String EMAIL = "EMAIL";
        private static final String PASSWORD = "PASSWORD";

        public String uname;
        public String pass;


        public Database(Context context) {
            super(context, DATABASE_NAME, null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,EMAIL TEXT,PASSWORD TEXT)");

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
            onCreate(db);
        }

        public void insertData(String email, String password ){
            SQLiteDatabase db = this.getWritableDatabase();//create database and table

            ContentValues contentValues = new ContentValues();

            contentValues.put(EMAIL, email);

            contentValues.put(PASSWORD, password);

            db.insert(TABLE_NAME, null, contentValues);
            db.close();

        }

        public String search(String password){

            SQLiteDatabase db = this.getReadableDatabase();
            String query = "select EMAIL, PASSWORD from " + TABLE_NAME;
            Cursor cursor = db.rawQuery(query, null);


            if(cursor.moveToFirst()) {
                do {
                    uname = cursor.getString(0);
                    pass = cursor.getString(1);

                    if (uname.equals(EMAIL) && pass.equals(PASSWORD)) {
                        uname = cursor.getString(0);
                        pass = cursor.getString(1);
                        break;
                    }
                }
                while (cursor.moveToNext());
            }

            return pass;
        }



        public String searchUname(String uname){

            SQLiteDatabase db = this.getReadableDatabase();
            String query = "select EMAIL, PASSWORD from " + TABLE_NAME;
            Cursor cursor = db.rawQuery(query, null);


            if(cursor.moveToFirst()) {
                do {
                    uname = cursor.getString(0);
                    pass = cursor.getString(1);

                    if (uname.equals(EMAIL) && pass.equals(PASSWORD)) {
                        uname = cursor.getString(0);
                        pass = cursor.getString(1);
                        break;
                    }
                }
                while (cursor.moveToNext());
            }

            return uname;
        }

    }


