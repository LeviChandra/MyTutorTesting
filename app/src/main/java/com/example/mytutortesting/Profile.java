package com.example.mytutortesting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Profile extends AppCompatActivity {

    String username = "admin";
    String password = "admin";
    String fullName = "Admin Admin Admin";
    String nickName = "Nickname";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        EditText user = findViewById(R.id.usernameBox);
        EditText pass = findViewById(R.id.passwordBox);
        EditText fName = findViewById(R.id.fullNameBox);
        EditText nick = findViewById(R.id.nickNameBox);

        user.setText(username);
        pass.setText(password);
        fName.setText(fullName);
        nick.setText(nickName);
    }
}