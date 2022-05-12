package com.example.parkingmobileapp;
import java.io.IOException;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DatabaseAdapter {

    protected static final String TAG = "DataAdapter";

    private final Context context;
    private SQLiteDatabase myDB;
    private DataBaseHelper mDbHelper;

    public DatabaseAdapter(Context context) {
        this.context = context;
        mDbHelper = new DataBaseHelper(context);
    }

    public DatabaseAdapter createDatabase() throws SQLException {
        try {
            mDbHelper.createDataBase();
        } catch (IOException mIOException) {
            Log.e(TAG, mIOException.toString() + "  UnableToCreateDatabase");
            throw new Error("UnableToCreateDatabase");
        }
        return this;
    }

    public DatabaseAdapter open() throws SQLException {
        try {
            mDbHelper.openDataBase();
            mDbHelper.close();
            myDB = mDbHelper.getReadableDatabase();
        } catch (SQLException mSQLException) {
            Log.e(TAG, "open >>"+ mSQLException.toString());
            throw mSQLException;
        }
        return this;
    }

    public void close() {
        mDbHelper.close();
    }

    public Cursor getA1Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A1' " +
                    "ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT), " +
                    "cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, null);
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    public Cursor getA2Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A2' " +
                    "ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT), " +
                    "cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, null);
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    public Cursor getA3Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A3' " +
                    "ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT), " +
                    "cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, null);
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    public Cursor getA4Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A4' " +
                    "ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT), " +
                    "cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, null);
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    public Cursor getA5Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A5' " +
                    "ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT), " +
                    "cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, null);
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    public Cursor getA6Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A6' " +
                    "ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT), " +
                    "cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, null);
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    public Cursor getA7Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A7' " +
                    "ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT), " +
                    "cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, null);
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    public Cursor getA8Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A8' " +
                    "ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT), " +
                    "cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, null);
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    public Cursor getA9Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A9' " +
                    "ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT), " +
                    "cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, null);
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    public Cursor getA10Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A10' " +
                    "ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT), " +
                    "cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, null);
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
}
