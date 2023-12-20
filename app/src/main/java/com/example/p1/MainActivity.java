package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitEnter(View view)
    {
        Toast toast = Toast.makeText(this, "Welcome Login Successful", Toast.LENGTH_SHORT);


        toast.show();
    }
}