package com.example.custom_navigation_drawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {

    Button login;
    TextInputLayout email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Hooks
        email = findViewById(R.id.emailid);
        pass = findViewById(R.id.password);
        login = findViewById(R.id.loginbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation shake = AnimationUtils.loadAnimation(login.this, R.anim.shake);
                email.startAnimation(shake);
                pass.startAnimation(shake);
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public TranslateAnimation shakeError() {
        TranslateAnimation shake = new TranslateAnimation(0, 0, 0, 20);
        shake.setDuration(1000);
        shake.setInterpolator(new CycleInterpolator(2));
        return shake;
    }

    private void checkValidInputs() {


    }
}