package com.haha.mmxb.slidingconflict;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ScrollView;

/**
 * Created by xueying on 2018/1/2.
 */

public class SecondActivity extends Activity {

    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;
    private RecyclerView recyclerView4;
    private RecyclerView recyclerView5;

    private ScrollView scrollView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView1 = findViewById(R.id.recycler_view1);
        recyclerView2 = findViewById(R.id.recycler_view2);
        recyclerView3 = findViewById(R.id.recycler_view3);
        recyclerView4 = findViewById(R.id.recycler_view4);
        recyclerView5 = findViewById(R.id.recycler_view5);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this);
        linearLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView1.setAdapter(new SecondAdapter());

        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);
        linearLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setAdapter(new SecondAdapter());

        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(this);
        linearLayoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        recyclerView3.setAdapter(new SecondAdapter());

        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(this);
        linearLayoutManager4.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView4.setLayoutManager(linearLayoutManager4);
        recyclerView4.setAdapter(new SecondAdapter());

        LinearLayoutManager linearLayoutManager5 = new LinearLayoutManager(this);
        linearLayoutManager5.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView5.setLayoutManager(linearLayoutManager5);
        recyclerView5.setAdapter(new SecondAdapter());

    }
}
