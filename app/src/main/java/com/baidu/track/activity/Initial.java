package com.baidu.track.activity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;
import com.baidu.track.GUI.LoginActivity;
import com.baidu.track.GUI.Main2Activity;
import com.baidu.track.GUI.signup;
import com.baidu.track.R;

public class Initial extends Activity {

    private MapView mapView;
    private BaiduMap baiduMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial2);
        mapView = (MapView) findViewById(R.id.bmapView);
        baiduMap = mapView.getMap();
        baiduMap.setMyLocationEnabled(true);
        ImageButton Button1 = (ImageButton)findViewById(R.id.button1);
        Button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Initial.this, Main2Activity.class);
                startActivity(intent);
                //LoginActivity.this.finish();
            }
        });
    }

}
