package com.github.mazmellow.testmodule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Maz on 9/12/16 AD.
 */
public class SdkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdk);

        //jgjldjldglkdvlkvdlkndvvdnlk
    }

    public static Intent buildIntent(Context context){
        Intent intent = new Intent(context, SdkActivity.class);
        return intent;
    }
}
