package com.example.frame;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChange = (Button) findViewById(R.id.btnChange);
        FragmentManager fm = getFragmentManager();
        View.OnClickListener listener = new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment bl = new BlankFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.secondFrame1,new BlankFragment()).commit();

                fragmentTransaction.commit();
            }
        };

        btnChange.setOnClickListener(listener);
    }


}