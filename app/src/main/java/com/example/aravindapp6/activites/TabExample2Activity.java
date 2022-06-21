package com.example.aravindapp6.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.aravindapp6.R;
import com.example.aravindapp6.adapter.MyPagerAdapter2;
import com.google.android.material.tabs.TabLayout;

public class TabExample2Activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    MyPagerAdapter2 myPagerAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_example2);

        tabLayout=findViewById(R.id.tab);
        viewPager2=findViewById(R.id.ViewPager2);

        myPagerAdapter2=new MyPagerAdapter2(getSupportFragmentManager(),getLifecycle());
        viewPager2.setAdapter(myPagerAdapter2);

        tabLayout.addTab(tabLayout.newTab().setText("BOOK"));
        tabLayout.addTab(tabLayout.newTab().setText("SPORTS"));
        tabLayout.addTab(tabLayout.newTab().setText("MOVIE"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

    }
}