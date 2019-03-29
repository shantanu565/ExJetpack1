package com.shantanu.example.exjetpack1;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ExViewmodel extends AppCompatActivity {
    Button btnChange;
    LinearLayout linearLayout;
    MyViewModel model;
    int count,newValue,check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_viewmodel);

        model=ViewModelProviders.of(this).get(MyViewModel.class);
        btnChange=(Button)findViewById(R.id.btnChangeColor);


        linearLayout=(LinearLayout)findViewById(R.id.LinLay);
        if (model.getCounter()==1){
            Toast.makeText(this,model.getCounter()+"",Toast.LENGTH_SHORT).show();

            linearLayout.setBackgroundColor(Color.BLACK);
        }else {
            linearLayout.setBackgroundColor(Color.RED);

        }
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (model.getCounter()==1){
                    model.setCounter(2);
                    Toast.makeText(v.getContext(),model.getCounter()+"",Toast.LENGTH_SHORT).show();

                    linearLayout.setBackgroundColor(Color.RED);
                }else {
                    model.setCounter(1);
                    linearLayout.setBackgroundColor(Color.BLACK);

                }


            }
        });



    }
}
