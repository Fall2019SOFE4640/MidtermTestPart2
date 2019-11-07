package com.example.presentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper mySQLiteHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create the database -- see DatabaseHelper class for more details
        mySQLiteHelper = new DatabaseHelper(this,null,null,1);

        //add records to the database
        //no need to modify...
//        GiftReceiver person1 = new GiftReceiver("Dad",2,100);
//        GiftReceiver person2 = new GiftReceiver("John",1,25);
//        GiftReceiver person3 = new GiftReceiver("Mary",1,25);
//        GiftReceiver person4 = new GiftReceiver("Mom",3,150);
//        GiftReceiver person5 = new GiftReceiver("Adam",1,50);
//
//        mySQLiteHelper.addRecord(person1);
//        mySQLiteHelper.addRecord(person2);
//        mySQLiteHelper.addRecord(person3);
//        mySQLiteHelper.addRecord(person4);
//        mySQLiteHelper.addRecord(person5);


        //Retrieve  all records from the table
        Cursor c = mySQLiteHelper.getAllRows();

        //Write your code here to fill the text view all records from the table
        // Task 1 Part b



    }


    //Write your code here to handel the button action
    // Task 2 Part b
    public void btnTapped(View v){

    }



}
