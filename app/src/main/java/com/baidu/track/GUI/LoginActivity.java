package com.baidu.track.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.track.R;
import com.baidu.track.activity.Initial;
//import com.baidu.track.activity.Initial;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }
        Button button_login = (Button)findViewById(R.id.loginBtn);
        button_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, Initial.class);
                startActivity(intent);
            }
        });
        TextView textview_sighin = (TextView)findViewById(R.id.signin);
        textview_sighin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, signup.class);
                startActivity(intent);
                //LoginActivity.this.finish();
            }
        });

        TextView forget = (TextView)findViewById(R.id.forgotPassword);
        forget.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, Fogetpassword.class);
                startActivity(intent);
                //LoginActivity.this.finish();
            }
        });

        ImageButton facebook = (ImageButton)findViewById(R.id.facebook_login);
        facebook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Facebook", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton google = (ImageButton)findViewById(R.id.google_login);
        google.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Google", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

