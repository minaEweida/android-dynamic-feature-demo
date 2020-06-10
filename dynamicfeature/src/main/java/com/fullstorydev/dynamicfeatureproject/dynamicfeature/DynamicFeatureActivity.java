package com.fullstorydev.dynamicfeatureproject.dynamicfeature;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.fullstory.FS;
import com.fullstorydev.dynamicfeaturedemo.BaseSplitActivity;

public class DynamicFeatureActivity extends BaseSplitActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamic_feature_main);
        Log.d("DynamicFeatureActivity", "FS URL is:" + FS.getCurrentSessionURL());
    }
}
