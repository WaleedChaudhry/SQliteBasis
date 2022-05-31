package com.example.sqlitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHandler db=new DBHandler(this,"empDB",null,1);
        db.addEmployer(new Employee(1,"Waleed",45.1));
        db.getEmployee(1);
        db.close();
    }
}