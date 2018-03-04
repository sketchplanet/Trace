package com.baidu.track.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.track.Control.ActivityCode;
import com.baidu.track.R;

public class EnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }
        Button Return = (Button)findViewById(R.id.returntofront);
        Return.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText et_age = (EditText) findViewById(R.id.inputcode);
                if(et_age.length() == 0){
                    Toast.makeText(getApplicationContext(), "请输入活动码！", Toast.LENGTH_SHORT).show();
                }else{
                    int codenub = Integer.parseInt(et_age.getText().toString());
                    if(ActivityCode.codelist.contains(codenub)){
                        Toast.makeText(getApplicationContext(), "加入活动成功！", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(EnterActivity.this, Main2Activity.class);
                        startActivity(intent);
                        EnterActivity.this.finish();
                    }else{
                        Toast.makeText(getApplicationContext(), "没有发现此活动！", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        TextView goback = (TextView)findViewById(R.id.Return);
        goback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EnterActivity.this.finish();
            }
        });
    }
}
