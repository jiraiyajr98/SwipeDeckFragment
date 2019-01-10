package com.intern.ankan.internui;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;

    List<GetterSetter> list = new ArrayList<>();

    private ViewPager mPager ;

    private CardStackAdapter mAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // recyclerView = findViewById(R.id.recycler);

        //adapter = new Adapter(MainActivity.this,list);
       // recyclerView.setAdapter(adapter);
        //recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL,false));

        //addData();


        mPager = (ViewPager) findViewById(R.id.viewpager);

        mAdapter = new CardStackAdapter(getSupportFragmentManager());

        mPager.setPageTransformer(true, new CardStackTransformer());

        mPager.setOffscreenPageLimit(5);

        mPager.setAdapter(mAdapter);

    }

    private class CardStackTransformer implements ViewPager.PageTransformer
    {
        @Override
        public void transformPage(View page, float position)
        {
            if(position>=0)
            {
                page.setScaleX(0.8f - 0.02f * position);

                page.setScaleY(0.8f);

                page.setTranslationX(- page.getWidth()*position);

                page.setTranslationY(30 * position);
            }

        }
    }

    void addData(){

        list.add(new GetterSetter("Business Management",30));
        list.add(new GetterSetter("IT & Cloud Computing",80));
        list.add(new GetterSetter("Learn How To Play Guitar",50));
        list.add(new GetterSetter("Basics of Baking Cakes",20));
        list.add(new GetterSetter("Modern Meditation",50));
        list.add(new GetterSetter("Project Management",90));

        adapter.notifyItemRangeInserted(0,list.size());
    }
}
