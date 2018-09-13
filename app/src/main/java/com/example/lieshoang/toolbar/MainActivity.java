package com.example.lieshoang.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        //thiet lap title subtitle
        toolbar.setTitle("Home");

        //thiet lap toolbar thay cho actionbar
        setSupportActionBar(toolbar);

        //thiet lap navigation icon
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_add);

        //thiet lap su kien cho navigation icon
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
