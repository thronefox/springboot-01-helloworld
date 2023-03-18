package com.littlestar.controller;

import com.littlestar.bean.vue.OrderObj;
import com.littlestar.bean.vue.Product;
import com.littlestar.bean.vue.TableObj;
import com.littlestar.bean.vue.Userdata;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.Subject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.sql.Array;
import java.util.*;

@RestController
@Slf4j
@CrossOrigin
public class TestController {


    @RequestMapping("/test/{path}")
    public Map testMetrixVariable(@MatrixVariable("id") String  id,
                                  @MatrixVariable("name") String name,
                                  @MatrixVariable("path") String path) {

        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        map.put("path",id);

        return map;
    }

    @RequestMapping("/test")
    public Map getParams(HttpSession session) {

        HashMap<String, Subject> map = new HashMap<>();
        return map;
    }

    @RequestMapping("/testCookie")
    public Map getParams(@CookieValue("JSESSIONID") Cookie cookie) {
        System.out.println(cookie.getName()+"-"+cookie.getValue() );
        HashMap<String, Subject> map = new HashMap<>();
        return map;
    }




    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "GET-张三";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String saveUser(){
        return "POST-张三";
    }


    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String putUser(){
        return "PUT-张三";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-张三";
    }


    @RequestMapping("/api/home/getData")
    public Map<String,Object> getStr(){
        HashMap<String, Object> map = new HashMap<>();
        //制造table数据
        List<TableObj> tableObjs = Arrays.asList(new TableObj("oppo", 500, 3500, 22000),
                new TableObj("vivo", 300, 2200, 24000),
                new TableObj("苹果", 800, 4500, 65000),
                new TableObj("小米", 1200, 6500, 45000),
                new TableObj("三星", 300, 2000, 34000),
                new TableObj("魅族", 350, 3000, 22000),
                new TableObj("诺基亚", 350, 3000, 22000));
        map.put("tableData",tableObjs);

        //制造订单数据 orderData
        List list = new ArrayList();

        HashMap<String, Object> mapHashMap = new HashMap<>();
        mapHashMap.put("data",OrderObj.getMap(3961, 3031, 4859, 4570, 2493, 7239));
        mapHashMap.put("date","20220101");
        list.add(mapHashMap);

        mapHashMap = new HashMap<>();
        mapHashMap.put("data",OrderObj.getMap(5964, 7087, 2256, 4411, 3003, 1600));
        mapHashMap.put("date","20220102");
        list.add(mapHashMap);
        mapHashMap = new HashMap<>();
        mapHashMap.put("data",OrderObj.getMap(3281, 1252, 912, 3472, 3492, 3000));
        mapHashMap.put("date","20220103");
        list.add(mapHashMap);
        mapHashMap = new HashMap<>();
        mapHashMap.put("data",OrderObj.getMap(3427, 4429, 5054, 1385, 3845, 900));
        mapHashMap.put("date","20220104");
        list.add(mapHashMap);
        mapHashMap = new HashMap<>();
        mapHashMap.put("data",OrderObj.getMap(2296, 932, 3802, 2580, 6939, 1200));
        mapHashMap.put("date","20220105");
        list.add(mapHashMap);
        mapHashMap = new HashMap<>();
        mapHashMap.put("data",OrderObj.getMap(4744, 5189, 2256, 4555, 8000, 6000));
        mapHashMap.put("date","20220106");
        list.add(mapHashMap);

        map.put("zxData",list);

        ArrayList<Object> userData = new ArrayList<>();
        userData.add(new Userdata("周一",5,200));
        userData.add(new Userdata("周二",10,500));
        userData.add(new Userdata("周三",12,550));
        userData.add(new Userdata("周四",60,800));
        userData.add(new Userdata("周五",65,550));
        userData.add(new Userdata("周六",53,770));
        userData.add(new Userdata("周日",33,170));
        map.put("userData",userData);

        ArrayList<Object> videoData = new ArrayList<>();
        videoData.add(new Product("小米",2999));
        videoData.add(new Product("苹果",5999));
        videoData.add(new Product("vivo",1500));
        videoData.add(new Product("oppo",1999));
        videoData.add(new Product("魅族",2200));
        videoData.add(new Product("三星",4500));
        map.put("videoData",videoData);

        return map;
    }
}
