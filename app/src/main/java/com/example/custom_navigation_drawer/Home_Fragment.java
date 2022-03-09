package com.example.custom_navigation_drawer;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class Home_Fragment extends Fragment {

    ImageView school;
    public View mView;


    public Home_Fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_home, container, false);
/*        school=(ImageView) mView.findViewById(R.id.schoolimg);

        mView.setOnClickListener(e -> {
        });*/

        return mView;


    }

}