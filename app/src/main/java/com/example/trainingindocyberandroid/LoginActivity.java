package com.example.trainingindocyberandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    EditText username, password1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password1 = (EditText) findViewById(R.id.password1);
        btn_login = (Button) findViewById(R.id.login);

        // Set Onclick Listener Berfungsi untuk memberi aksi
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().equals("") && password1.getText().toString().equals("") ) {
                    Toast.makeText(LoginActivity.this, "Harap isi username dan password", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent (LoginActivity.this, RegisterActivity.class));
                    // Destroy Aplikasi
                    finish();

                    // bikin TOAST
                    Toast.makeText(LoginActivity.this, "Selamat anda berhasil login", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}
