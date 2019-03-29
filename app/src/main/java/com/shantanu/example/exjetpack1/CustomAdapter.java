package com.shantanu.example.exjetpack1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private List<User> users;

    public CustomAdapter(List<User> users) {
        this.users = users;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View statusContainer = inflater.inflate(R.layout.rowlayout, parent, false);

        return new UserViewHolder(statusContainer);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User status = users.get(position);
        holder.bind(status);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
