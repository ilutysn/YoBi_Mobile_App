package com.tugas.yobimobile;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


;import com.tugas.yobimobile.database.UserRegisterDbHelper;
import com.tugas.yobimobile.database.UserResgisterContract;

public class RegisterActivity extends AppCompatActivity {
    UserRegisterDbHelper dbHelper;
    SQLiteDatabase database;
    EditText passwod_field, email_field, user_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
        dbHelper = new UserRegisterDbHelper(this);
        database = dbHelper.getWritableDatabase();

        passwod_field = (EditText) findViewById(R.id.password_field);
        email_field = (EditText) findViewById(R.id.email_field);
        user_field = (EditText) findViewById(R.id.name_field);
    }

    public void back_home(View view) {
        Intent login_intent = new Intent(this, LoginActivity.class);
        startActivity(login_intent);

    }

    public void do_register(View view) {
        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        String email = email_field.getText().toString();
        String nama = user_field.getText().toString();
        String passwd = passwod_field.getText().toString();
        values.put(UserResgisterContract.UserEntry.COLUMN_NAME_EMAIL, email);
        values.put(UserResgisterContract.UserEntry.COLUMN_NAME_NAMA, nama);
        values.put(UserResgisterContract.UserEntry.COLUMN_NAME_PASSWORD, passwd);

        // Insert the new row, returning the primary key value of the new row
        long newRowId = database.insert(UserResgisterContract.UserEntry.TABLE_NAME, null, values);

    }
}
