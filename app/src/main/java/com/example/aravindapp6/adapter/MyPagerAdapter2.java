package com.example.aravindapp6.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.aravindapp6.fragments.BookFragment;
import com.example.aravindapp6.fragments.MovieFragment;
import com.example.aravindapp6.fragments.SportsFragment;

public class MyPagerAdapter2 extends FragmentStateAdapter {
    public MyPagerAdapter2(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment=new Fragment();
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
    public int getItemCount() {
        return 3;
    }
}
