package com.example.presentsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;


public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERVION =1;
    private static final String DATABASE_NAME = "MyGifts1.db";
    private static final String TABLE_NAME = "myGifts";
    private static final String COL_1 = "GiftReceiverName"; // The person who will receive the gift
    private static final String COL_2 = "NumberOfGifts";//number of gits I will give to that person
    private static final String COL_3 = "BudgetAssigned";//my budget I will assign to a that person

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERVION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + "(" +
                COL_1 + " Text NOT NULL," +
                COL_2 +  " Integer, "  +
                COL_3 +  " Integer " +");" ;
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table " + TABLE_NAME + ";" );
        this.onCreate(db);
    }

    public void addRecord(GiftReceiver giftReceiver){
        ContentValues values= new ContentValues();
        values.put(COL_1,giftReceiver.getGiftReceiverName());
        values.put(COL_2,giftReceiver.getNumberOfGifts());
        values.put(COL_3,giftReceiver.getBudgetAssigned());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_NAME,null,values);
        db.close();
    }

    public Cursor getAllRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        String query ="Select * from " + TABLE_NAME +";";
        Cursor cursor = db.rawQuery(query,null);
        if (cursor!=null){
            cursor.moveToFirst();
        }
        return cursor;

    }

//write your code here for Task 1 Part a

    public String CursorToString(Cursor c){
        String result="";


        return result;

    }


    //write your code here for Task 2 Part a

    public int getNumberOfgifs (Cursor c){
        int result=0;


        return result;
    }

//write your code here for Task 2 Part a

    public int getTotalBudget  (Cursor c){
        int result=0;


        return result;
    }

}
