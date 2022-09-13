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
    public Cursor getA11Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A11' " +
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
    public Cursor getA12Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'A12' " +
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
    public Cursor getB1Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B1' " +
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
    public Cursor getB2Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B2' " +
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
    public Cursor getB3Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B3' " +
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
    public Cursor getB4Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B4' " +
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
    public Cursor getB5Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B5' " +
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
    public Cursor getB6Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B6' " +
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
    public Cursor getB7Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B7' " +
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
    public Cursor getB8Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B8' " +
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
    public Cursor getB9Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B9' " +
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
    public Cursor getB10Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B10' " +
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
    public Cursor getB11Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B11' " +
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
    public Cursor getB12Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B12' " +
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
    public Cursor getB13Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B13' " +
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
    public Cursor getB14Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B14' " +
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
    public Cursor getB15Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B15' " +
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
    public Cursor getB16Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B16' " +
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
    public Cursor getB17Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'B17' " +
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
    public Cursor getC1Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C1' " +
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
    public Cursor getC2Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C2' " +
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
    public Cursor getC3Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C3' " +
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
    public Cursor getC4Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C4' " +
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
    public Cursor getC5Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C5' " +
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
    public Cursor getC6Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C6' " +
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
    public Cursor getC7Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C7' " +
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
    public Cursor getC8Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C8' " +
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
    public Cursor getC9Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C9' " +
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
    public Cursor getC10Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C10' " +
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
    public Cursor getC11Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C11' " +
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
    public Cursor getC12Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C12' " +
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
    public Cursor getC13Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C13' " +
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
    public Cursor getC14Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C14' " +
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
    public Cursor getC15Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C15' " +
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
    public Cursor getC16Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'C16' " +
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
    public Cursor getD1Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D1' " +
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
    public Cursor getD2Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D2' " +
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
    public Cursor getD3Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D3' " +
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
    public Cursor getD4Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D4' " +
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
    public Cursor getD5Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D5' " +
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
    public Cursor getD6Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D6' " +
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
    public Cursor getD7Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D7' " +
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
    public Cursor getD8Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D8' " +
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
    public Cursor getD9Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D9' " +
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
    public Cursor getD10Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D10' " +
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
    public Cursor getD11Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D11' " +
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
    public Cursor getD12Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D12' " +
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
    public Cursor getD13Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D13' " +
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
    public Cursor getD14Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D14' " +
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
    public Cursor getD15Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D15' " +
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
    public Cursor getD16Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D16' " +
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
    public Cursor getD17Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = '17' " +
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
    public Cursor getD18Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D18' " +
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
    public Cursor getD19Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D19' " +
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
    public Cursor getD20Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D20' " +
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
    public Cursor getD21Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D21' " +
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
    public Cursor getD22Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D22' " +
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
    public Cursor getD23Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D23' " +
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
    public Cursor getD24Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'D24' " +
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



    public Cursor getE1Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E1' " +
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
    public Cursor getE2Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E2' " +
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
    public Cursor getE3Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E3' " +
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
    public Cursor getE4Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E4' " +
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
    public Cursor getE5Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E5' " +
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
    public Cursor getE6Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E6' " +
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
    public Cursor getE7Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E7' " +
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
    public Cursor getE8Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E8' " +
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
    public Cursor getE9Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E9' " +
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
    public Cursor getE10Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E10' " +
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
    public Cursor getE11Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E11' " +
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
    public Cursor getE12Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E12' " +
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
    public Cursor getE13Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E13' " +
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
    public Cursor getE14Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E14' " +
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
    public Cursor getE15Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E15' " +
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
    public Cursor getE16Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E16' " +
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
    public Cursor getE17Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E17' " +
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
    public Cursor getE18Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E18' " +
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
    public Cursor getE19Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E19' " +
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
    public Cursor getE20Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E20' " +
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
    public Cursor getE21Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E21' " +
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
    public Cursor getE22Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E22' " +
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
    public Cursor getE23Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E23' " +
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
    public Cursor getE24Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'E24' " +
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
    public Cursor getF1Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F1' " +
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
    public Cursor getF2Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F2' " +
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
    public Cursor getF3Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F3' " +
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
    public Cursor getF4Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F4' " +
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
    public Cursor getF5Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F5' " +
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
    public Cursor getF6Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F6' " +
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
    public Cursor getF7Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F7' " +
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
    public Cursor getF8Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F8' " +
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
    public Cursor getF9Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F9' " +
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
    public Cursor getF10Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F10' " +
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
    public Cursor getF11Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F11' " +
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
    public Cursor getF12Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F12' " +
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
    public Cursor getF13Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F13' " +
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
    public Cursor getF14Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F14' " +
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
    public Cursor getF15Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F15' " +
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
    public Cursor getF16Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F16' " +
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
    public Cursor getF17Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F17' " +
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
    public Cursor getF18Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F18' " +
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
    public Cursor getF19Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F19' " +
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
    public Cursor getF20Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F20' " +
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
    public Cursor getF21Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F21' " +
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
    public Cursor getF22Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F22' " +
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
    public Cursor getF23Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F23' " +
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
    public Cursor getF24Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'F24' " +
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
    public Cursor getG1Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G1' " +
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
    public Cursor getG2Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G2' " +
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
    public Cursor getG3Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G3' " +
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
    public Cursor getG4Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G4' " +
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
    public Cursor getG5Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G5' " +
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
    public Cursor getG6Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G6' " +
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
    public Cursor getG7Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G7' " +
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
    public Cursor getG8Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G8' " +
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
    public Cursor getG9Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G9' " +
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
    public Cursor getG10Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G10' " +
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
    public Cursor getG11Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G11' " +
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
    public Cursor getG12Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G12' " +
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
    public Cursor getG13Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G13' " +
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
    public Cursor getG14Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G14' " +
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
    public Cursor getG15Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G15' " +
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
    public Cursor getG16Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G16' " +
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
    public Cursor getG17Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G17' " +
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
    public Cursor getG18Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G18' " +
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
    public Cursor getG19Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G19' " +
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
    public Cursor getG20Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G20' " +
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
    public Cursor getG21Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G21' " +
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
    public Cursor getG22Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G22' " +
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
    public Cursor getG23Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G23' " +
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
    public Cursor getG24Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'G24' " +
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
    public Cursor getH1Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H1' " +
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
    public Cursor getH2Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H2' " +
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
    public Cursor getH3Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H3' " +
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
    public Cursor getH4Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H4' " +
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
    public Cursor getH5Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H5' " +
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
    public Cursor getH6Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H6' " +
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
    public Cursor getH7Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H7' " +
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
    public Cursor getH8Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H8' " +
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
    public Cursor getH9Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H9' " +
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
    public Cursor getH10Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H10' " +
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
    public Cursor getH11Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H11' " +
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
    public Cursor getH12Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H12' " +
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
    public Cursor getH13Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H13' " +
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
    public Cursor getH14Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H14' " +
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
    public Cursor getH15Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H15' " +
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
    public Cursor getH16Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H16' " +
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
    public Cursor getH17Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H17' " +
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
    public Cursor getH18Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H18' " +
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
    public Cursor getH19Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H19' " +
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
    public Cursor getH20Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H20' " +
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
    public Cursor getH21Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H21' " +
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
    public Cursor getH22Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H22' " +
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
    public Cursor getH23Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H23' " +
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
    public Cursor getH24Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H24' " +
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
    public Cursor getH25Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H25' " +
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
    public Cursor getH26Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H26' " +
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
    public Cursor getH27Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H27' " +
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
    public Cursor getH28Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H28' " +
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
    public Cursor getH29Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H29' " +
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
    public Cursor getH30Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'H30' " +
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

    public Cursor getI1Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I1' " +
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
    public Cursor getI2Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I2' " +
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
    public Cursor getI3Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I3' " +
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
    public Cursor getI4Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I4' " +
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
    public Cursor getI5Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I5' " +
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
    public Cursor getI6Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I6' " +
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
    public Cursor getI7Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I7' " +
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
    public Cursor getI8Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I8' " +
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
    public Cursor getI9Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I9' " +
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
    public Cursor getI10Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I10' " +
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
    public Cursor getI11Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I11' " +
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
    public Cursor getI12Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I12' " +
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
    public Cursor getI13Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I13' " +
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
    public Cursor getI14Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I14' " +
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
    public Cursor getI15Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I15' " +
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
    public Cursor getI16Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I16' " +
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
    public Cursor getI17Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I17' " +
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
    public Cursor getI18Status() {
        try {
            String sql ="SELECT status FROM parkings_tracked WHERE slot_id = 'I18' " +
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


