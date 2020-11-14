package com.tugas.yobimobile.database;

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


}
