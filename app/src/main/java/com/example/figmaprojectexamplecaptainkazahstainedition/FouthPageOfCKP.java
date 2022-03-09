package com.example.figmaprojectexamplecaptainkazahstainedition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class FouthPageOfCKP extends AppCompatActivity {

    float x1, x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fouth_page_of_ckp);
        findViewById(R.id.imgGoHome).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent switcher=new Intent(FouthPageOfCKP.this,MainActivity.class);
                startActivity(switcher);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });
        findViewById(R.id.imgGoHomeText).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent switcher=new Intent(FouthPageOfCKP.this,MainActivity.class);
                startActivity(switcher);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });
        findViewById(R.id.galleryPage).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent switcher=new Intent(FouthPageOfCKP.this,GalleryPageOfCKP.class);
                startActivity(switcher);
                overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_down);
            }
        });
    }
    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 < x2 & Math.abs(y1-y2)<150){
                    Intent i = new Intent(FouthPageOfCKP.this, ActivityThirdPageOfCkp.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                }
                else if (y1>y2 & Math.abs(x1-x2)<150){
                    Intent intent = new Intent(this, DownThirdPageOfCKP.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_down,R.anim.slide_out_up);
                }
                break;
        }
        return false;
    }
    public void goToPage6(View view) {
        Intent intent = new Intent(this, FifthPageOfCKP.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down,R.anim.slide_out_up);
    }
}