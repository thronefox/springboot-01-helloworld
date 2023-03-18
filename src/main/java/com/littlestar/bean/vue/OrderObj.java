package com.littlestar.bean.vue;

import java.util.HashMap;
import java.util.Map;

public class OrderObj {

    public static Map<String,Object> getMap(int n1,int n2,int n3,int n4,int n5,int n6){
        HashMap<String, Object> map = new HashMap<>();
        map.put("oppo",n1);
        map.put("vivo",n2);
        map.put("三星",n3);
        map.put("小米",n4);
        map.put("苹果",n5);
        map.put("魅族",n6);

        return map;
    }
}
