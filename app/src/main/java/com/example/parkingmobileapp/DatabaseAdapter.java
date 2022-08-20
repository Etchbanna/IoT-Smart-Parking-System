package com.example.parkingmobileapp;
import java.io.IOException;
import java.sql.Time;
import java.util.Calendar;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

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

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA1Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);




            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A1' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
//            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A1' AND minute= ?  " ;
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA2Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A2' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA3Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A3' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA4Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A4' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA5Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A5' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA6Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A6' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA7Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A7' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA8Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A8' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA9Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A9' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA10Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A10' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getB1Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B1' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getB2Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B2' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getB3Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B3' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getB4Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B4' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getB5Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B5' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getB6Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B6' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getB7Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B7' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getB8Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B8' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getB9Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B9' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
            if (mCur != null) {
                mCur.moveToNext();
            }
            return mCur;
        } catch (SQLException mSQLException) {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getB10Status() {
        try {
            int min= TimeHandler.now.get(Calendar.MINUTE);
            int mon=TimeHandler.now.get(Calendar.MONTH);
            int day=TimeHandler.now.get(Calendar.DAY_OF_MONTH);
            int hour=TimeHandler.now.get(Calendar.HOUR);
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B10' AND minute<=?"+
                    " ORDER BY ABS(? - cast(month AS INT)) ASC ,ABS(? - cast(DAY as int)) ASC ," +
                    "ABS(?- cast(hour as int)) ASC ,ABS(? - cast(minute as int)) ASC LIMIT 1 ";
            Cursor mCur = myDB.rawQuery(sql, new String[]{String.valueOf(min),String.valueOf(mon),String.valueOf(day),String.valueOf(hour),String.valueOf(min)});
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
