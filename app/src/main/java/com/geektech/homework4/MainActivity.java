package com.geektech.homework4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity  {

    Button button;
    EditText et1, et2;
    RecyclerView recyclerView;
    MainAdapter adapter;
    public int REQUEST_CODE = 600;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        et1 = findViewById(R.id.etT1);
        et2 = findViewById(R.id.etT2);
        button = findViewById(R.id.button);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RecView.class);
                intent.putExtra("key1", (Serializable) et1);
                intent.putExtra("key2", (Serializable) et2);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });

    }
}