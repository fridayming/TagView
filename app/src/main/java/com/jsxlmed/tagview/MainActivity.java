package com.jsxlmed.tagview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jsxlmed.tagview.weigh.LabelsView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private LabelsView labelsView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labelsView = findViewById(R.id.labels);
        ArrayList<String> label = new ArrayList<>();
        label.add("Android");
        label.add("IOS");
        label.add("前端");
        label.add("后台");
        label.add("微信开发");
        label.add("游戏开发微信开发");
        label.add("Java");
        label.add("JavaScript游戏开发微信开发");
        label.add("C++");
        label.add("PHP");
        label.add("Python");
        label.add("Swift");

        labelsView.setLabels(label);

        labelsView.setOnLabelClickListener(new LabelsView.OnLabelClickListener() {
            @Override
            public void onLabelClick(TextView label, Object data, int position) {
                Toast.makeText(MainActivity.this, position + " : " + data,
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
