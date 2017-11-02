package com.yad.tapan;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yad.tapan.aktu_sample.R;


public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity";

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectyear);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void first(View view) {
        Intent i1 =new Intent(Main2Activity.this,year1.class);
        startActivity(i1);
    }

    public void second(View view) {
        Intent i2 =new Intent(Main2Activity.this,Branch.class);
        startActivity(i2);
    }


    public void third(View view) {
        Intent i2 =new Intent(Main2Activity.this,Branch3.class);
        startActivity(i2);
    }

    public void finalyear(View view) {
        Intent i2 =new Intent(Main2Activity.this,Branch4.class);
        startActivity(i2);
    }
}
