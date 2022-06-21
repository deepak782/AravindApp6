package com.example.aravindapp6.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.aravindapp6.R;
import com.example.aravindapp6.adapter.MyPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class TabExample1Activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_example1);
        tabLayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.ViewPager);
        myPagerAdapter=new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}