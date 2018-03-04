package com.baidu.track.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.track.R;

public class signup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button submit_button = (Button)findViewById(R.id.submit);
        submit_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "请填写有效信息！", Toast.LENGTH_SHORT).show();
            }
        });
        TextView login_str = (TextView)findViewById(R.id.login);
        login_str.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                signup.this.finish();
            }
        });
    }


}
