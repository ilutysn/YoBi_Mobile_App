package com.tugas.yobimobile;

import android.provider.BaseColumns;

public final class UserResgisterContract{
  private UserResgisterContract(){}
  public static class UserEntry implements BaseColumns{
      static final String TABLE_NAME = "registration_table";
  }

}
