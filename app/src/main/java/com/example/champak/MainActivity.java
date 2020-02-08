package com.example.champak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    Button login,create;
    String getUser,getPass;
    String userName = "santosh";
    String password = "abcde";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        login = findViewById(R.id.login);
        create = findViewById(R.id.create);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUser = user.getText().toString();
                getPass = pass.getText().toString();
                if(!(getUser.equals(user) || getPass.equals(password))) {
                    Toast.makeText(MainActivity.this,"Please check username and password", Toast.LENGTH_SHORT).show();
                    user.setText("");
                    pass.setText("");
                } else {
                    Intent intent = new Intent(MainActivity.this,secondactivity.class);
                    intent.putExtra("user",getUser);
                    startActivity(intent);

                }

            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,thirdactivity.class);
                startActivity(intent);
            }
        });
    }
}
