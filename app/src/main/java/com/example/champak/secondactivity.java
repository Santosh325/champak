package com.example.champak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class secondactivity extends AppCompatActivity {
    String user;
    String p,f,r;
    TextView uname;
    TextView proj,foll,repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        uname = findViewById(R.id.name);
        user = getIntent().getStringExtra("user");
        uname.setText(user);


        proj = findViewById(R.id.project);
        foll = findViewById(R.id.follow);
        repo = findViewById(R.id.repos);

        p = getIntent().getStringExtra("project");
        f = getIntent().getStringExtra("follower");
        r = getIntent().getStringExtra("repos");

        proj.setText(p);
        foll.setText(f);
        repo.setText(r);

    }
}
