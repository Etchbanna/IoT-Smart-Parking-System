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
    public Cursor getA11Status() {
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
    public Cursor getA12Status() {
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
    public Cursor getA13Status() {
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
    public Cursor getA14Status() {
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
    public Cursor getA15Status() {
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
    public Cursor getA16Status() {
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
    public Cursor getA17Status() {
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
    public Cursor getA18Status() {
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
    public Cursor getA19Status() {
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
    public Cursor getA20Status() {
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
    public Cursor getA21Status() {
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
    public Cursor getA22Status() {
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
    public Cursor getA23Status() {
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
    public Cursor getA24Status() {
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
    public Cursor getA25Status() {
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
    public Cursor getA26Status() {
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
    public Cursor getA27Status() {
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
    public Cursor getA28Status() {
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
    public Cursor getA29Status() {
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
    public Cursor getA30Status() {
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
    public Cursor getA31Status() {
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
    public Cursor getA32Status() {
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
    public Cursor getA33Status() {
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
    public Cursor getA34Status() {
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
    public Cursor getA35Status() {
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
    public Cursor getA36Status() {
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
    public Cursor getA37Status() {
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
    public Cursor getA38Status() {
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
    public Cursor getA39Status() {
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
    public Cursor getA40Status() {
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
    public Cursor getA41Status() {
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
    public Cursor getA42Status() {
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
    public Cursor getA43Status() {
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
    public Cursor getA44Status() {
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
    public Cursor getA45Status() {
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
    public Cursor getA46Status() {
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
    public Cursor getA47Status() {
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
    public Cursor getA48Status() {
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
    public Cursor getA49Status() {
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
    public Cursor getA50Status() {
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
    public Cursor getA51Status() {
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
    public Cursor getA52Status() {
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
    public Cursor getA53Status() {
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
    public Cursor getA54Status() {
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
    public Cursor getA55Status() {
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
    public Cursor getA56Status() {
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
    public Cursor getA57Status() {
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
    public Cursor getA58Status() {
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
    public Cursor getA59Status() {
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
    public Cursor getA60Status() {
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
    public Cursor getA61Status() {
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
    public Cursor getA62Status() {
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
    public Cursor getA63Status() {
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
    public Cursor getA64Status() {
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
    public Cursor getA65Status() {
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
    public Cursor getA66Status() {
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
    public Cursor getA67Status() {
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
    public Cursor getA68Status() {
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
    public Cursor getA69Status() {
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
    public Cursor getA70Status() {
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
    public Cursor getA71Status() {
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
    public Cursor getA72Status() {
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
    public Cursor getA73Status() {
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
    public Cursor getA74Status() {
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
    public Cursor getA75Status() {
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
    public Cursor getA76Status() {
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
    public Cursor getA77Status() {
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
    public Cursor getA78Status() {
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
    public Cursor getA79Status() {
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
    public Cursor getA80Status() {
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
    public Cursor getA81Status() {
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
    public Cursor getA82Status() {
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
    public Cursor getA83Status() {
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
    public Cursor getA84Status() {
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
    public Cursor getA85Status() {
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
    public Cursor getA86Status() {
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
    public Cursor getA87Status() {
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
    public Cursor getA88Status() {
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
    public Cursor getA89Status() {
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
    public Cursor getA90Status() {
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
    public Cursor getA91Status() {
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
    public Cursor getA92Status() {
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
    public Cursor getA93Status() {
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
    public Cursor getA94Status() {
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
    public Cursor getA95Status() {
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
    public Cursor getA96Status() {
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
    public Cursor getA97Status() {
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
    public Cursor getA98Status() {
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
    public Cursor getA99Status() {
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
    public Cursor getA100Status() {
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
    } @RequiresApi(api = Build.VERSION_CODES.O)
    public Cursor getA101Status() {
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
    public Cursor getA102Status() {
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
    public Cursor getA103Status() {
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
    public Cursor getA104Status() {
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
    public Cursor getA105Status() {
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
    public Cursor getA106Status() {
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
    public Cursor getA107Status() {
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
    public Cursor getA108Status() {
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
    public Cursor getA109Status() {
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
    public Cursor getA110Status() {
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
