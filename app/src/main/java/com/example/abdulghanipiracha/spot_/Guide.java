package com.example.abdulghanipiracha.spot_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Guide extends AppCompatActivity implements OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view_guide);
        navigationView.setNavigationItemSelectedListener(this);

        Button back = findViewById(R.id.buttonforback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Guide.this, YoutubePlayer.class);
                intent.putExtra("video", "OXvQe9payHw");
                startActivity(intent);
            }
        });

        Button biceps = findViewById(R.id.buttonforbiceps);
        biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Guide.this, YoutubePlayer.class);
                intent.putExtra("video", "gozU3CUIizs");
                startActivity(intent);
            }
        });

        Button arms = findViewById(R.id.buttonforarms);
        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Guide.this, YoutubePlayer.class);
                intent.putExtra("video", "CzhMgdWdMjg");
                startActivity(intent);
            }
        });

        Button legs = findViewById(R.id.buttonforlegs);
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Guide.this, YoutubePlayer.class);
                intent.putExtra("video", "LHcnpP2KVDM");
                startActivity(intent);
            }
        });


    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Log.d("spot_guide", "nav item selected");
        if (id == R.id.nav_calender) {
            Intent intent = new Intent(this, Calendar.class);
            startActivity(intent);

        }
        if (id == R.id.nav_guide) {
            Intent intent = new Intent(this, Guide.class);
            startActivity(intent);

        }
//        if (id == R.id.nav_map) {
//            Intent intent = new Intent(this, Map.class);
//            startActivity(intent);

//        }
        if (id == R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
        return false;

    }


}
