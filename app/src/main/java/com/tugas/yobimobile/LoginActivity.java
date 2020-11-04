package com.tugas.yobimobile;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText input_password, input_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        input_password = (EditText) findViewById(R.id.input_password);
        input_email = (EditText) findViewById(R.id.input_email);


    }

    public void register(View view) {
        Intent register_intent = new Intent(this, RegisterActivity.class);
        startActivity(register_intent);
    }

    public void do_login(View view) {
        String email = input_email.getText().toString();
        String paswd = input_password.getText().toString();
        boolean is_autenticated = authenticate(email, paswd);
        if (is_autenticated) {
            Intent home_intent = new Intent(this, HomeActivity.class);
            startActivity(home_intent);
        }

    }

    private boolean authenticate(String email, String paswd) {
        //String email dan String paswd seharusnya di sanitize dulu
        //Karena masalah keamanan, Supaya terhindar dari serangan
        //SQL injection oleh hacker2 jahat
        return email.equals("n@bila.com") && paswd.equals("123456");
    }
}