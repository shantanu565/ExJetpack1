package com.shantanu.example.exjetpack1;

import android.arch.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private int counter;

    public void setCounter(int c){
        this.counter=c;
    }
    public int getCounter(){
        return counter;
    }
}
