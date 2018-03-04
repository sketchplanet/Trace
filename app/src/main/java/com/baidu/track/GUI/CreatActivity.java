package com.baidu.track.GUI;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.track.R;

public class CreatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }
        TextView textview_return = (TextView)findViewById(R.id.Return);
        textview_return.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CreatActivity.this.finish();
            }
        });

        ImageButton creatactivity = (ImageButton)findViewById(R.id.logo);
        creatactivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "地理围栏已创建！", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CreatActivity.this, Codedisplay.class);
                CreatActivity.this.finish();
                startActivity(intent);
            }
        });

        ImageButton creatactivity2 = (ImageButton)findViewById(R.id.logo2);
        creatactivity2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "轨迹监控已创建！", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(CreatActivity.this, Codedisplay.class);
                CreatActivity.this.finish();
                startActivity(intent2);
            }
        });


    }
}
