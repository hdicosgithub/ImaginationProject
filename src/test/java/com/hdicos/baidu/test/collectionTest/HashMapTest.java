package com.hdicos.baidu.test.collectionTest;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName HashMapTest.java
 * @Description TODO
 * @createTime 2021年06月23日 14:31:00
 */
public class HashMapTest {
    @Test
    public void testTraversal() {
        HashMap<Integer, String> hashMap = new HashMap<>(16);
        hashMap.put(7, "");
        hashMap.put(11, "");
        hashMap.put(43, "");
        hashMap.put(59, "");
        hashMap.put(19, "");
        hashMap.put(3, "");
        hashMap.put(35, "");
        System.out.println("遍历结果");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + "--->");
        }
    }
}
