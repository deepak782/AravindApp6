package com.example.aravindapp6.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.aravindapp6.R;
import com.example.aravindapp6.fragments.LoginFragment;
import com.example.aravindapp6.fragments.SignUpFragment;

public class SimpleFragmentsActivity extends AppCompatActivity {
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_fragments);

        fragment=new LoginFragment();
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container,fragment);
        fragmentTransaction.commit();

        findViewById(R.id.Login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragment=new LoginFragment();
                fragmentManager=getSupportFragmentManager();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container,fragment);
                fragmentTransaction.commit();

            }
        });

        findViewById(R.id.Signup_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragment=new SignUpFragment();
                fragmentManager=getSupportFragmentManager();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container,fragment);
                fragmentTransaction.commit();

            }
        });
    }
}