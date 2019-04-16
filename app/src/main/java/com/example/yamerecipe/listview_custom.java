package com.example.yamerecipe;

import android.graphics.drawable.Drawable;


public class listview_custom  {
    private Drawable content_img;
    private String   text_title;
    private String   text_sub;
    private String   user_name;
    private String   date_time;

    public void setContent_img(Drawable img){
        content_img = img;
    }
    public void setText_title(String title){
        text_title = title;
    }
    public void setText_sub(String sub){
        text_sub = sub;
    }
    public void setUser_name(String name){
        user_name = name;
    }
    public void setDate_time(String date){
        date_time = date;
    }

    public Drawable getContent_img() {
        return this.content_img;
    }
    public String getTitle() {
        return this.text_title;
    }
    public String getSub() {
        return this.text_sub;
    }
    public String getUsername() {
        return this.user_name;
    }
    public String getDatetime() {
        return this.date_time;
    }
}
