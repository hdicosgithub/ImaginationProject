package com.hdicos.baidu.guide;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author hdicos
 * @version 1.0
 * @description: 循环hashmap 的7种方式
 * @date 2022/4/19 14:38
 */
public class HashMapTest {
    public static void main(String[] args) {
        // 创建并赋值 HashMap     迭代器 EntrySet
        Map<Integer, String> map = new HashMap();
        map.put(1, "Java");
        map.put(2, "JDK");
        map.put(3, "Spring Framework");
        map.put(4, "MyBatis framework");
        map.put(5, "Java中文社群");
        //1.迭代器 EntrySet
        Iterator<Map.Entry<Integer,String>> iteratorMap=map.entrySet().iterator();
        while (iteratorMap.hasNext()){
            Map.Entry<Integer,String> entry=iteratorMap.next();
            System.out.printf(entry.getKey().toString());
            System.out.printf(entry.getValue());
        }


        //2.迭代器 KeySet
        Iterator<Integer> iteratorInt=map.keySet().iterator();
        while (iteratorInt.hasNext()){
            Integer key=iteratorInt.next();
            System.out.printf("key值", key);
            System.out.printf("value值", map.get(key));
        }


        //3.ForEach EntrySet
        for (Map.Entry<Integer,String> entry:map.entrySet()) {
            System.out.printf("key", entry.getKey());
            System.out.printf("value", entry.getValue());
        }
        //4.ForEach KeySet
        // 遍历
        for (Integer key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

        //5.Lambda
        map.forEach((key,value)->{
            System.out.printf("key", key);
            System.out.printf("value", value);
        });
        //6.Streams API 单线程
        map.entrySet().stream().forEach((entry)->{
            System.out.printf("key", entry.getKey());
            System.out.printf("value", entry.getValue());
        });
        //7.Streams API 多线程
        map.entrySet().parallelStream().forEach((entry)->{
            System.out.printf("key", entry.getKey());
            System.out.printf("value", entry.getValue());
        });
    }
}
