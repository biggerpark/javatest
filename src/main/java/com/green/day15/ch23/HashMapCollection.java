package com.green.day15.ch23;

import java.util.*;
import java.util.HashMap;


public class HashMapCollection {
    public static void main(String[] args) {
        //Map 은 인터페이스다.
        //Key, Value - Value 를 얻어오고 싶을때
        Map<String,String> map=new HashMap<>();


        map.put("홍길동","시계");
        map.put("권혜지","자바책");
        map.put("이정민","빈 캔");

        String v=map.get("홍길동");//
        System.out.println("v:"+v);

        System.out.println(map.get("김수지")); // 없으면 null 이 return 된다.





    }
}
