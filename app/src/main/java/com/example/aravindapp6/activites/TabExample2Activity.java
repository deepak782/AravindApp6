package com.example.aravindapp6.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.aravindapp6.R;
import com.example.aravindapp6.adapter.MyPagerAdapter2;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class TabExample2Activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    MyPagerAdapter2 myPagerAdapter2;
    TabLayoutMediator tabLayoutMediator;
    BadgeDrawable badgeDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_example2);

        tabLayout=findViewById(R.id.tab);
        viewPager2=findViewById(R.id.ViewPager2);

        myPagerAdapter2=new MyPagerAdapter2(getSupportFragmentManager(),getLifecycle());
        viewPager2.setAdapter(myPagerAdapter2);

       /* tabLayout.addTab(tabLayout.newTab().setText("BOOK"));
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
        });*/

        tabLayoutMediator=new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position)
                {
                    case 0:
                      //  tab.setText("Book");
                        tab.setIcon(R.drawable.ic_baseline_book_24);
                        badgeDrawable=tab.getOrCreateBadge();
                        badgeDrawable.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.teal_700));
                        badgeDrawable.setVisible(true);
                        badgeDrawable.setNumber(90);
                        badgeDrawable.setMaxCharacterCount(3);
                        break;
                    case 1:
                      //  tab.setText("Movie");
                        tab.setIcon(R.drawable.ic_baseline_movie_24);
                        badgeDrawable=tab.getOrCreateBadge();
                        badgeDrawable.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.teal_700));
                        badgeDrawable.setVisible(true);
                        badgeDrawable.setNumber(50);
                        badgeDrawable.setMaxCharacterCount(3);
                        break;
                    case 2:
                        //tab.setText("Sports");
                        tab.setIcon(R.drawable.ic_baseline_sports_24);
                        badgeDrawable=tab.getOrCreateBadge();
                        badgeDrawable.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.teal_700));
                        badgeDrawable.setVisible(true);
                        badgeDrawable.setNumber(20);
                        badgeDrawable.setMaxCharacterCount(3);
                        break;
                }



            }
        });

        tabLayoutMediator.attach();


        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                badgeDrawable=tabLayout.getTabAt(position).getOrCreateBadge();
                badgeDrawable.setVisible(false);
            }
        });

    }
}