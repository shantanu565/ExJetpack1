package com.shantanu.example.exjetpack1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Databindfrag extends Fragment {
    RecyclerView recyclerView;
    CustomAdapter customAdapter;
    List<User> users;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.databindfrag, container, false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

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
        return rootView;
    }
}
