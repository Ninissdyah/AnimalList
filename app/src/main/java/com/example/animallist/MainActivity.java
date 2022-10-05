package com.example.animallist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ArrayList<Animal> animals = new ArrayList<>();
    private AnimalAdapter animalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fungsi yang isinya data yang akan ditampilkan
        addData();

        animalAdapter = new AnimalAdapter(this, animals);
        recyclerView = findViewById(R.id.rv_animal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(animalAdapter);
    }

    private void addData() {
        //untuk menambah data yang ditampilkan
        animals.add(new Animal("Zac Britishcat", "Jantan", "Ketua geng british"));
        animals.add(new Animal("Joomla Britishcat", "Betina", "Pasangan ketua geng british"));
        animals.add(new Animal("Hamlet Britishcat", "Jantan", "Si paling ramah dan tidak sombong"));
        animals.add(new Animal("Zill Britishcat", "Betina", "Penggemar ketua geng british, tapi dicuekin"));
        animals.add(new Animal("Brownie Brown", "Jantan", "Si Paling mahal"));
    }
}