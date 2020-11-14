package com.tugas.yobimobile;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


;import com.tugas.yobimobile.database.UserRegisterDbHelper;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
        UserRegisterDbHelper dbHelper = new UserRegisterDbHelper(getApplicationContext());
        SQLiteDatabase database = dbHelper.getWritableDatabase();
    }

    public void back_home(View view) {
        Intent login_intent = new Intent(this, LoginActivity.class);
        startActivity(login_intent);

    }
}
