package com.example.demoproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s1[]={"india","japan","china","usa"};
        for (int i=s1.length-1;i>=0;i--){
            System.out.println("out is="+s1[i]);
        }
    }
}
