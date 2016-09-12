package com.mazmellow.testmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mazmellow.testmodule.sdk.SdkActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSdk = (Button)findViewById(R.id.btnSdk);
        btnSdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = SdkActivity.buildIntent(MainActivity.this);
                startActivity(intent);
            }
        });
    }
}
