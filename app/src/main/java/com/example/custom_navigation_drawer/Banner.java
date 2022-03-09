package com.example.custom_navigation_drawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.custom_navigation_drawer.Adapter.FeaturedAdappter;
import com.example.custom_navigation_drawer.Adapter.Featured_Helperclass;

import java.util.ArrayList;

public class Banner extends AppCompatActivity {
    RecyclerView featuredRecycler;
    RecyclerView.Adapter adapter;
    ImageView school;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //hooks
        featuredRecycler=findViewById(R.id.featured_recycler);
        featuredRecycler();
        school=findViewById(R.id.schoolimg);
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Banner.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }


    private void featuredRecycler() {
        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<Featured_Helperclass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new Featured_Helperclass(R.drawable.image1, "Welcome to NEW ERA School"));
        featuredLocations.add(new Featured_Helperclass(R.drawable.image2, "Welcome to NEW ERA School"));
        featuredLocations.add(new Featured_Helperclass(R.drawable.image3, "Welcome to NEW ERA School"));

        adapter = new FeaturedAdappter(featuredLocations);
        featuredRecycler.setAdapter(adapter);
    }

}