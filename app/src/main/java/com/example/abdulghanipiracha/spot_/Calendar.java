package com.example.abdulghanipiracha.spot_;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Calendar extends AppCompatActivity implements OnNavigationItemSelectedListener {

    private EditText height;
    private EditText weight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        result = (TextView) findViewById(R.id.Result);


        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
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
//
//        }
        if (id == R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
        return false;

    }

    public void calculateBMI(View v) {
        String heightstr = height.getText().toString();
        String weightstr = weight.getText().toString();
        if (!"".equals(heightstr) && !"".equals(weightstr)) {
            float heightvalue = Float.parseFloat(heightstr);
            float weightvalue = Float.parseFloat(weightstr);

            float bmi = weightvalue / (heightvalue * heightvalue);

            result.setText(""+bmi);

        } else {
            result.setText("enter height and weight");
        }

    }

}
