package com.example.custom_navigation_drawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class settingimg extends AppCompatActivity {
    ImageView settingexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingimg);
        settingexit=findViewById(R.id.setting_logout);
        settingexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(settingimg.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}