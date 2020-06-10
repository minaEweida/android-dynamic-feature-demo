package com.fullstorydev.dynamicfeaturedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SplitInstallManager splitInstallManager = SplitInstallManagerFactory.create(getApplicationContext());

        LinearLayout ll = findViewById(R.id.ll_main);
        Button btn = new Button(this);
        btn.setText("Load Dynamic Feature");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClassName(BuildConfig.APPLICATION_ID, "com.fullstorydev.dynamicfeatureproject.dynamicfeature.DynamicFeatureActivity");
                startActivity(intent);
            }
        });

        ll.addView(btn);
    }
}