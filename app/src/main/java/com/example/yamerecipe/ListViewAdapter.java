package com.example.yamerecipe;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    //Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<listview_custom> listview_customs = new ArrayList<listview_custom>();

    //L Adapter에 사용되는 데이터의 개수를 리턴. !필수구헌
    @Override
    public int getCount() {
        return listview_customs.size();
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return listview_customs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        //"listview_custom" Layout을 inflate하여 convertView 참조 획득
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_custom, parent, false);
        }

        //화면에 표시될 View(Layout이 inflate된) 으로부터 위젯에 대한 참조 획득
        ImageView imageView = (ImageView) convertView.findViewById(R.id.content_img);
        TextView titleTextview = (TextView) convertView.findViewById(R.id.text_title);
        TextView subTexview = (TextView) convertView.findViewById(R.id.text_sub);
        TextView user_name = (TextView) convertView.findViewById(R.id.user_name);
        TextView date_time = (TextView) convertView.findViewById(R.id.date_time);

        //Data set(listView_custom)에서 postion에 위치한 데이터 참조 획득
        listview_custom listview_custom = listview_customs.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        imageView.setImageDrawable(listview_custom.getContent_img());
        titleTextview.setText(listview_custom.getTitle());
        subTexview.setText(listview_custom.getSub());
        user_name.setText(listview_custom.getUsername());
        date_time.setText(listview_custom.getDatetime());

        return convertView;
    }
    public void addItem(Drawable content_img, String title, String sub_title, String user_name, String date_time ){
        listview_custom item = new listview_custom();

        item.setContent_img(content_img);
        item.setText_title(title);
        item.setText_sub(sub_title);
        item.setUser_name(user_name);
        item.setDate_time(date_time);

        listview_customs.add(item);
    }
}
