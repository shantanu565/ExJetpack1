package com.shantanu.example.exjetpack1;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.shantanu.example.exjetpack1.databinding.RowlayoutBinding;

public class UserViewHolder extends RecyclerView.ViewHolder {
    private RowlayoutBinding binding;

    public UserViewHolder(View view) {
        super(view);
        binding = DataBindingUtil.bind(view);
    }

    public void bind(User user) {
        binding.setUsers(user);
    }
}
