package com.example.mytutortesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username = "admin";
    String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user = findViewById(R.id.usernameBox);
        EditText pass = findViewById(R.id.passwordBox);
        Button login = findViewById(R.id.loginButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().equalsIgnoreCase(username) && pass.getText().toString().equalsIgnoreCase(password)) {
                    startActivity(new Intent(MainActivity.this, homepage.class));
                } else {
                    Toast.makeText(MainActivity.this, "Wrong Username/Password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}