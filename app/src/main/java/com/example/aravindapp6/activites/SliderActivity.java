package com.example.aravindapp6.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.example.aravindapp6.R;
import com.example.aravindapp6.adapter.MyAdapter;

public class SliderActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    MyAdapter myAdapter;
    int[] images={R.color.purple_700,R.color.teal_700,R.color.purple_200,R.color.teal_200};
    int[] images1={R.color.purple_700,R.color.teal_700,R.color.purple_200,R.color.teal_200};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        viewPager2=findViewById(R.id.viewPager2);
        myAdapter=new MyAdapter(this,images);
        viewPager2.setAdapter(myAdapter);

        CompositePageTransformer compositePageTransformer=new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(8));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                 float v=1-Math.abs(position);
                 page.setScaleY(0.8f+v*0.2f);
            }
        });
        viewPager2.setPageTransformer(compositePageTransformer);
    }
}