package com.baidu.track.Control;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/1/2.
 */

public class ActivityCode {
    public int code;
    public static ArrayList<Integer> codelist = new ArrayList<Integer>();
    public ActivityCode(int code){
        this.code = code;
        codelist.add(code);
    }
}
