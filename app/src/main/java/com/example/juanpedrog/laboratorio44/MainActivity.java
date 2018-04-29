package com.example.juanpedrog.laboratorio44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    Button translate,fade,rotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
        translate=findViewById(R.id.translate);
        fade=findViewById(R.id.fade);
        rotate=findViewById(R.id.rotate);
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation =
                        AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                imageView.startAnimation(animation);
            }
        });
        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation =
                        AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                imageView.startAnimation(animation);
            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation =
                        AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                imageView.startAnimation(animation);
            }
        });
    }

    public void onButtonClick(View v) {
        Animation animation =
                AnimationUtils.loadAnimation(this, R.anim.translate);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //imageView.setScaleX(2);
                //imageView.setScaleY(2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        imageView.startAnimation(animation);
    }
}
