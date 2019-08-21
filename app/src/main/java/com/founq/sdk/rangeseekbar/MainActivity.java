package com.founq.sdk.rangeseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.founq.sdk.rangeseekbar.R;
import com.founq.sdk.rangeseekbar.widget.RangeBar;

public class MainActivity extends AppCompatActivity {

    private RangeBar mRangeBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRangeBar = findViewById(R.id.range_bar);
    }
}
