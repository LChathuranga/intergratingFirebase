package com.example.firebasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.etName);
        EditText age = findViewById(R.id.etAge);
        Button button = findViewById(R.id.button);

        DAOUser daoUser = new DAOUser();

        button.setOnClickListener(v ->
        {

            User user = new User(name.getText().toString(),age.getText().toString());
            daoUser.add(user);
        });
    }
}