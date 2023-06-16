package com.example.mobile_dev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void Lab_7(View view) {
        Intent intent = new Intent(this, Lab_7_Activity.class);
        startActivity(intent);
    }

    public void Lab_8(View view) {
        Intent intent = new Intent(this, Lab_8_Activity.class);
        startActivity(intent);
    }

    public void Lab_9(View view) {
        Intent intent = new Intent(this, Lab_9_Activity.class);
        startActivity(intent);
    }
}