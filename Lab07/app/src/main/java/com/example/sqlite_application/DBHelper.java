package com.example.sqlite_application;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper{

    private static final String DB_NAME="courseData";
    private static final int DB_VERSION=1;
    private static final String TABLE_NAME="courses";
    private static final String ID_COL = "id";
    private static final String NAME_COL = "name";
    private static final String DURATION_COL = "duration";
    private static final String DESCRIPTION_COL = "description";
    private static final String TRACKS_COL = "tracks";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // on below line we are creating
        // an sqlite query and we are
        // setting our column names
        // along with their data types.
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + DURATION_COL + " TEXT,"
                + DESCRIPTION_COL + " TEXT,"
                + TRACKS_COL + " TEXT)";

        // at last we are calling a exec sql
        // method to execute above sql query
        db.execSQL(query);
    }

    // this method is use to add new course to our sqlite database.
    public void addNewCourse(String courseName, String courseDuration, String courseDescription, String courseTracks) {

        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        SQLiteDatabase db = this.getWritableDatabase();

        // on below line we are creating a
        // variable for content values.
        ContentValues values = new ContentValues();

        // on below line we are passing all values
        // along with its key and value pair.
        values.put(NAME_COL, courseName);
        values.put(DURATION_COL, courseDuration);
        values.put(DESCRIPTION_COL, courseDescription);
        values.put(TRACKS_COL, courseTracks);

        // after adding all values we are passing
        // content values to our table.
        db.insert(TABLE_NAME, null, values);

        // at last we are closing our
        // database after adding database.
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertUserData(String name, String contact, String dob) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("contact", contact);
        contentValues.put("dob", dob);
        long result = DB.insert("UserDetails", null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
        public boolean updateUserData(String name, String contact, String dob){
            SQLiteDatabase DB= this.getWritableDatabase();
            ContentValues contentValues= new ContentValues();
            contentValues.put("contact",contact);
            contentValues.put("dob",dob);

            Cursor cursor=DB.rawQuery("select * from UserDetails where name=?",new String[]{name});

            if (cursor.getCount()>0){
                long result=DB.update("UserDetails",contentValues,"name=?",new String[]{name});
                if (result== -1){
                    return false;
                }
                else {
                    return true;
                }
            }
            else {
                return false;
            }

    }

    public boolean deleteUserData(String name){
        SQLiteDatabase DB= this.getWritableDatabase();

        Cursor cursor=DB.rawQuery("select * from UserDetails where name=?",new String[]{name});

        if (cursor.getCount()>0){
            long result=DB.delete("UserDetails","name=?",new String[]{name});
            if (result== -1){
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }

    }

    public Cursor getData(){
        SQLiteDatabase DB=this.getWritableDatabase();
        Cursor cursor=DB.rawQuery("select * from UserDetails",null);
        return cursor;
    }
}
