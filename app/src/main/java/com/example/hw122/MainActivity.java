package com.example.hw122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random r = new Random();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button backButton = (Button) findViewById(R.id.backButton);
        Button fwdButton = (Button) findViewById(R.id.fwdButton);
        TextView urlText = (TextView) findViewById(R.id.urlText);
        ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        urlText.setText(getString(R.string.urlString, r.nextInt(100)));

    }

    public void goBack(View view) {
    this.finish();
//        finishAffinity();
    }

    public void goFwd(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }

}