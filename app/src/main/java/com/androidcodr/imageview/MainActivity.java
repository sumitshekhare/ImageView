package com.androidcodr.imageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView dpimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dpimage=(ImageView) findViewById(R.id.imageView);

    }


    public void changeimg(View view){
        dpimage.setImageResource(R.drawable.androidcodrlogo);
    }
}

