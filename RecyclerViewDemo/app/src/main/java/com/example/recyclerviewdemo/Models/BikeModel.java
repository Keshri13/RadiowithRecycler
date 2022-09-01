package com.example.recyclerviewdemo.Models;

import android.util.Log;

public class BikeModel {
    int pic;
    String text;

    public BikeModel(int pic, String text) {
        this.pic = pic;
        this.text = text;
        Log.d("Model","Are you Ready");
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
