package com.example.cheshta.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int res = getIntent().getIntExtra("result",0);
        ((TextView)findViewById(R.id.tvresult)).setText(String.valueOf(res));
    }
}
