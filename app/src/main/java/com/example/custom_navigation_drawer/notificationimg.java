package com.example.custom_navigation_drawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class notificationimg extends AppCompatActivity {
    ImageView notilogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificationimg);
        notilogout=findViewById(R.id.noti_logout);
        notilogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(notificationimg.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}