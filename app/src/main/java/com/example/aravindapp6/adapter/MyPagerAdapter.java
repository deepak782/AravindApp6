package com.example.aravindapp6.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.aravindapp6.fragments.BookFragment;
import com.example.aravindapp6.fragments.MovieFragment;
import com.example.aravindapp6.fragments.SportsFragment;

public class MyPagerAdapter extends FragmentPagerAdapter {

    Fragment fragment;
    String string;


    public MyPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        fragment=new Fragment();
        switch (position)
        {
            case 0:
                fragment=new BookFragment();
                break;
            case 1:
                fragment=new SportsFragment();
                break;
            case 2:
                fragment=new MovieFragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                string="Book";
                break;
            case 1:
                string="Sports";
                break;
            case 2:
                string="Movies";
                break;
        }
        return string;
    }
}
