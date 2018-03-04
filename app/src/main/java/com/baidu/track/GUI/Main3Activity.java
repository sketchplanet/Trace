package com.baidu.track.GUI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.baidu.track.R;
import com.baidu.track.activity.CacheManageActivity;
import com.baidu.track.activity.FenceActivity;
import com.baidu.track.activity.MainActivity;
import com.baidu.track.activity.TracingActivity;
import com.baidu.track.activity.TrackQueryActivity;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button1 = (Button)findViewById(R.id.bu1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main3Activity.this, TracingActivity.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button)findViewById(R.id.bu2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main3Activity.this, TrackQueryActivity.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button)findViewById(R.id.bu3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main3Activity.this, FenceActivity.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button)findViewById(R.id.bu4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main3Activity.this, CacheManageActivity.class);
                startActivity(intent);
            }
        });
    }
}
