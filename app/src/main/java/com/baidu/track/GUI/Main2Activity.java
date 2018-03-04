package com.baidu.track.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.baidu.track.R;
import com.baidu.track.activity.Main3Activity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }

        TextView textview_logout = (TextView)findViewById(R.id.logout);
        textview_logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Main2Activity.this.finish();
            }
        });


        Button creatactivity = (Button)findViewById(R.id.creatactivity);
        creatactivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main2Activity.this, CreatActivity.class);
                startActivity(intent);
            }
        });

        Button joinactivity = (Button)findViewById(R.id.joinactivity);
        joinactivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main2Activity.this, EnterActivity.class);
                startActivity(intent);
            }
        });

        Button myactivity = (Button)findViewById(R.id.myactivity);
        myactivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
               startActivity(intent);
            }
        });

    }
}
