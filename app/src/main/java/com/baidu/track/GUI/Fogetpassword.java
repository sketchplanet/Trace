package com.baidu.track.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.track.R;

public class Fogetpassword extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fogetpassword);
        TextView textview_sighin = (TextView)findViewById(R.id.login);
        textview_sighin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Fogetpassword.this.finish();
            }
        });
        Button button_submit = (Button)findViewById(R.id.submit);
        button_submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "请输入有效信息！", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
