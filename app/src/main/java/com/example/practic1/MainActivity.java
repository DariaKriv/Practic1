package com.example.practic1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        String geoUriString ="geo:68.140460, 33.270104? z=17";
        Uri geoUri= Uri.parse(geoUriString);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,geoUri);
        if (mapIntent.resolveActivity(getPackageManager()) !=null){
            startActivity(mapIntent);
        }
    }
}