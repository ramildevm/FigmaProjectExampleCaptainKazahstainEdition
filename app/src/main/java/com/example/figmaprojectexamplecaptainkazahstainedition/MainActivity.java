package com.example.figmaprojectexamplecaptainkazahstainedition;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.buttonGo2Page).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = null;
                View view = findViewById(R.id.imgGoHome);
                String str = getString(R.string.image_transition);
                if (view != null) {
                    ActivityOptions options;
                    options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, view, str);
                    bundle = options.toBundle();
                }
                Intent switcher = new Intent(MainActivity.this, SecondPageOfCKP.class);
                MainActivity.this.startActivity(switcher, bundle);
                overridePendingTransition(R.anim.alpha_in,R.anim.alpha_out);
            }
        });
    }
}