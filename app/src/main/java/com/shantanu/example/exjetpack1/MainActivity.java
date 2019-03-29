package com.shantanu.example.exjetpack1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter customAdapter;
    List<User> users;
    Button btnViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewModel=(Button)findViewById(R.id.btn_quessec);
        btnViewModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,ExViewmodel.class);
                startActivity(i);
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        users = new ArrayList<>();
        users.add(new User("ram","ram@gmail.com","8748346376437"));
        users.add(new User("shyaam","ram@gmail.com","8748346376437"));
        users.add(new User("raghav","ram@gmail.com","8748346376437"));
        users.add(new User("rimesh","ram@gmail.com","8748346376437"));
        users.add(new User("kritika","ram@gmail.com","8748346376437"));
        users.add(new User("Laxmi","ram@gmail.com","8748346376437"));
        users.add(new User("Parul","ram@gmail.com","8748346376437"));
        users.add(new User("rim","ram@gmail.com","8748346376437"));
        users.add(new User("rimesh","ram@gmail.com","8748346376437"));
        users.add(new User("rimesh","ram@gmail.com","8748346376437"));
        users.add(new User("rimesh","ram@gmail.com","8748346376437"));
        users.add(new User("rimesh","ram@gmail.com","8748346376437"));
        users.add(new User("rimesh","ram@gmail.com","8748346376437"));


        customAdapter = new CustomAdapter(users);
        recyclerView.setAdapter(customAdapter);
    }
}
