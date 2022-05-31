package com.example.sqlitedb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {
    public DBHandler(Context context,String name,SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create="CREATE TABLE EMPLOYEE(sno INTEGER PRIMARY KEY,name TEXT,increament TEXT)";
        db.execSQL(create);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String DROP=String.valueOf("DROP TABLE IF EXISTS)");
        db.execSQL(DROP,new String[]{"Employee"});
        onCreate(db);

    }
    public void addEmployer(Employee employee){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",employee.getName());
        values.put("increament",employee.getIncreament());
       // values.put("sno",employee.getSno());
        long k= db.insert("employee",null,values);
        Log.d("MYtag",Long.toString(k));
        db.close();

    }
    public void getEmployee(int sno){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cr=db.query(" EMPLOYEE",new String[]{"sno","name","increament"}
        ,"sno=?",new String[]{String.valueOf(sno)},null,null,null);
        if(cr!=null&&cr.moveToFirst()){
            Log.d("MyTag",cr.getString(1));
            Log.d("MyTag",cr.getString(2));
        }
        else
        {
            Log.d("MyTag","Some Error Occured");
        }

    }

}
