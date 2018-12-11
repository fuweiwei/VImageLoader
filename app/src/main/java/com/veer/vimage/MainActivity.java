package com.veer.vimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.iv);
        VImageUtils.disPlay(imageView,"http://5b0988e595225.cdn.sohucs.com/images/20181112/5e81aab009f34aac85ef2fd7bb4a0092.jpeg");
    }
}
