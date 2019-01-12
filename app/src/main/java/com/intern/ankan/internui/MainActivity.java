package com.intern.ankan.internui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
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

    ViewPagerAdapter pagerAdapter;

    List<GetterSetter> list = new ArrayList<>();

    private ViewPager mPager ;

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

        addData();
        pagerAdapter = new ViewPagerAdapter(list,MainActivity.this);
        mPager.setOffscreenPageLimit(list.size());


        mPager.setPageTransformer(true, new CardStackTransformer());

        mPager.setAdapter(pagerAdapter);
    }


    void addData(){

        list.add(new GetterSetter("Rima",R.drawable.image1));
        list.add(new GetterSetter("Neha",R.drawable.img2));
        list.add(new GetterSetter("Sara",R.drawable.img3));

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
}
