package com.example.empoweryouthcareeradvice;

import android.util.Log;

public class carreermodel {
    private String topic;
    private String view;
    private int img;
    private int color;


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setColor(int color) {
        this.color = color;
        Log.d("modelcolor", String.valueOf(this.color));
    }

    public int getImg() {
        return img;
    }

    public int getColor() {
        return color;
    }
}
