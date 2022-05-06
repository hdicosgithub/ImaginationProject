package com.hdicos.baidu.designpattern;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName Singleton.java
 * @Description TODO
 * @createTime 2021年06月25日 16:54:00
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getUniqueInstance() {
        //先判断对象是否已经实例过，没有实例过才进入加锁代码
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }

        /*
        容易陷入自我


      */

        return uniqueInstance;
    }

}
