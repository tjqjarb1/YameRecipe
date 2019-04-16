package com.example.yamerecipe;

        import android.support.v4.content.ContextCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.Toolbar;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
//        setSupportActionBar(toolbar);

        ListView listview ;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.main_content);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.test),
                "맛있파스타", "오고감을 봅니다.sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "서범규", "2019.04.16") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.test),
                "맛있파스타", "오고감을 봅니다.sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "서범규", "2019.04.16") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.test),
                "맛있파스타", "오고감을 봅니다.sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "서범규", "2019.04.16") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.test),
                "맛있파스타", "오고감을 봅니다.sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "서범규", "2019.04.16") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.test),
                "맛있파스타", "오고감을 봅니다.sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "서범규", "2019.04.16") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.test),
                "맛있파스타", "오고감을 봅니다.sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "서범규", "2019.04.16") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.test),
                "맛있파스타", "오고감을 봅니다.sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "서범규", "2019.04.16") ;
    }
}
