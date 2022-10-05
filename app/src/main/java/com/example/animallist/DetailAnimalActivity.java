package com.example.animallist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailAnimalActivity extends AppCompatActivity {
    TextView txtName, txtGender, txtDesc;
    String name, gender, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_animal);

        txtName = findViewById(R.id.txt_name);
        txtGender = findViewById(R.id.txt_gender);
        txtDesc = findViewById(R.id.txt_description);

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        gender = intent.getStringExtra("gender");
        desc = intent.getStringExtra("desc");

        txtName.setText(name);
        txtGender.setText(gender);
        txtDesc.setText(desc);

    }
}