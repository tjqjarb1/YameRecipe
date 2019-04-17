package com.example.yamerecipe;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class View_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        ListView listView;
        ListViewAdapter adapter;

        adapter = new ListViewAdapter();
        listView = (ListView) findViewById(R.id.c_list);
        listView.setAdapter(adapter);

        adapter.addComment("안녕","2019.04.17", "맛있파스타"); ;
    }
}
