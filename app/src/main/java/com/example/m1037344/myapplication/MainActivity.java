package com.example.m1037344.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"apk finally generated",Toast.LENGTH_SHORT).show();
        System.out.println("Test my application  :");
        System.out.println("Test my application 2 :");
        System.out.println("Test my application apk :");
    }
}
