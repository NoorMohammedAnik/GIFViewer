package com.app.gifviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.medialablk.easygifview.EasyGifView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyGifView easyGifView = (EasyGifView) findViewById(R.id.easyGifView);
        easyGifView.setGifFromResource(R.drawable.dance); //Your own GIF file from Resources

    }
}
