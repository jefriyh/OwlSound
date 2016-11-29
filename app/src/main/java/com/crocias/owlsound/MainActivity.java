package com.crocias.owlsound;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;
    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview = (ImageView) findViewById(R.id.imageView);

        imageview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mPlayer = MediaPlayer.create(getApplicationContext(),
                        R.raw.owl);
                mPlayer.start();




            }
        });
    }
}
