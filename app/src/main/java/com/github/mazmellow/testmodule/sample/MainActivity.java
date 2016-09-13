package com.github.mazmellow.testmodule.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.mazmellow.R;
import com.github.mazmellow.testmodule.SdkActivity;

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
