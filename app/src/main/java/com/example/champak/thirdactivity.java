package com.example.champak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class thirdactivity extends AppCompatActivity {
    EditText proj,fol,rep;
    Button profile;
    String pr,fo,re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);

        proj = findViewById(R.id.projects);
        fol = findViewById(R.id.followers);
        rep = findViewById(R.id.repository);
        profile = findViewById(R.id.nextProfile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pr = proj.getText().toString();
                fo = fol.getText().toString();
                re = rep.getText().toString();


                Intent intent = new Intent(thirdactivity.this,secondactivity.class);
                intent.putExtra("project",pr);
                intent.putExtra("follower",fo);
                intent.putExtra("repos",re);

                startActivity(intent);
            }
        });

    }
}
