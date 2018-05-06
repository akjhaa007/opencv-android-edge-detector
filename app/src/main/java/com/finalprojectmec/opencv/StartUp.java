package com.finalprojectmec.opencv;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by SnipThinK on 5/3/2018.
 */

@SuppressLint("Registered")
public class StartUp extends AppCompatActivity {
ImageView mCoin,mMarker,mPenDrive,mScissor,mJioCoin,mSpoon;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);
        mCoin = (ImageView) findViewById(R.id.coin);
        mMarker = (ImageView) findViewById(R.id.marker);
        mPenDrive = (ImageView) findViewById(R.id.pendrive);
        mScissor = (ImageView) findViewById(R.id.scissors);
        mJioCoin = (ImageView) findViewById(R.id.jiocoin);

        mSpoon = (ImageView) findViewById(R.id.spoon);

        mCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o =new Intent(getApplicationContext(),OneCoin.class);
                startActivity(o);
            }
        });


        mSpoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o =new Intent(getApplicationContext(),Sp.class);
                startActivity(o);
            }
        });

        mJioCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o =new Intent(getApplicationContext(),JioCoin.class);
                startActivity(o);
            }
        });


        mPenDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o =new Intent(getApplicationContext(),PenDrive.class);
                startActivity(o);
            }
        });


/*
        mMarker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o =new Intent(getApplicationContext(),Marker.class);
                startActivity(o);
            }
        });

*/
        mScissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o =new Intent(getApplicationContext(),Scissor.class);
                startActivity(o);
            }
        });

    }
}
