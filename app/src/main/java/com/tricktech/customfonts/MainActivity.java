package com.tricktech.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.icu.text.DisplayContext;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    public TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  txtView = (TextView) findViewById(R.id.txt_medium);
        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/AlexBrush-Regular.ttf");
        txtView.setTypeface(customFont);*/

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


}
