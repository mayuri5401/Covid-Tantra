package com.example.custom_navigation_drawer;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;

import static com.example.custom_navigation_drawer.R.id.nav_logout;

public class MainActivity extends AppCompatActivity {
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ImageView setting_img,notification_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_menu);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);


        setting_img=findViewById(R.id.setting);
        notification_img=findViewById(R.id.notification);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
 /*       getSupportFragmentManager().beginTransaction().replace(R.id.container,new Home()).commit();
        nav.setCheckedItem(R.id.nav_profile);*/

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            /*Fragment temp;*/
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.nav_home:
                        Toast.makeText(MainActivity.this, "Home pannel is open", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        /*temp = new Home();*/
                        break;
                    case nav_logout:
                        Toast.makeText(MainActivity.this, "logout pannel is open", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        /*temp=new settibng();*/
                        break;
                    case R.id.nav_profile:
                        Toast.makeText(MainActivity.this, "profile pannel is open", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        /*temp=new profile();*/
                        break;

                }
                /*etSupportFragmentManager().beginTransaction().replace(R.id.container,temp).commit();
                drawerLayout.closeDrawer(GravityCompat.START);*/
                return true;
            }
        });
        setting_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, settingimg.class);
                startActivity(intent);
            }
        });
        notification_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, notificationimg.class);
                startActivity(intent);
            }
        });

    }

}