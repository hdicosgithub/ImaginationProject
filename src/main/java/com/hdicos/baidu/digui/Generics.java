package com.hdicos.baidu.digui;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName Generics.java
 * @Description TODO
 * @createTime 2021年06月21日 10:16:00
 */
public class Generics<T> {
    private T key;

    public Generics(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }


}
