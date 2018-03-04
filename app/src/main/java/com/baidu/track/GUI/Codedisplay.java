package com.baidu.track.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.baidu.track.Control.ActivityCode;
import com.baidu.track.R;

import java.util.Random;

public class Codedisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codedisplay);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }
        TextView code = (TextView)findViewById(R.id.Code);
        Random rand = new Random();
        int codenumber = 157178;
        ActivityCode codenub = new ActivityCode(codenumber);
        String codestring = Integer.toString(codenumber);
        code.setText(codestring);

        Button returntofront = (Button)findViewById(R.id.returntofront);
        returntofront.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent intent = new Intent(Codedisplay.this, Main2Activity.class);
                //startActivity(intent);
                Codedisplay.this.finish();
            }
        });
    }
}
