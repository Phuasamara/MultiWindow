package com.example.multiwindow;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        myImageView.setImageResource(R.drawable.gambar);
    }
}