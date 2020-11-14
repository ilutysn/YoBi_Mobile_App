package com.tugas.yobimobile;

import android.provider.BaseColumns;

public final class UserResgisterContract {
    private UserResgisterContract() {
    }

    public static class UserEntry implements BaseColumns {
        static final String TABLE_NAME = "registration_table";
        public static final String COLUMN_NAME_NAMA = "nama";
        public static final String COLUMN_NAME_EMAIL = "email";
        public static final String COLUMN_NAME_PASSWORD = "passwd";

    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + UserEntry.TABLE_NAME + " (" +
                    UserEntry._ID + " INTEGER PRIMARY KEY," +
                    UserEntry.COLUMN_NAME_NAMA + " TEXT," +
                    UserEntry.COLUMN_NAME_EMAIL + " TEXT," +
                    UserEntry.COLUMN_NAME_PASSWORD + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + UserEntry.TABLE_NAME;


}
