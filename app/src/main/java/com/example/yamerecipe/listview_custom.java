package com.example.yamerecipe;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class listview_custom{
    private Drawable content_img;
    private String   text_title;
    private String   text_sub;
    private String   user_name;
    private String   date_time;

    //listviwe_comment
    private String c_name;
    private String c_date;
    private String c_comment;

    public void setContent_img(Drawable img){
        content_img = img;
    }
    public void setText_title(String title){ text_title = title; }
    public void setText_sub(String sub){ text_sub = sub; }
    public void setUser_name(String name){
        user_name = name;
    }
    public void setDate_time(String date){
        date_time = date;
    }

    public Drawable getContent_img() {
        return this.content_img;
    }
    public String getcontent_Title() { return this.text_title; }
    public String getSub() {
        return this.text_sub;
    }
    public String getUsername() {
        return this.user_name;
    }
    public String getDatetime() {
        return this.date_time;
    }

    //listview_comment
    public void setC_name(String name){c_name = name;}
    public void setC_date(String date){c_date = date;}
    public void setC_comment(String comment){c_comment = comment;}

    public String getC_name(){ return this.c_name;}
    public String getC_date(){ return this.c_date;}
    public String getC_comment(){ return this.c_comment;}

}
