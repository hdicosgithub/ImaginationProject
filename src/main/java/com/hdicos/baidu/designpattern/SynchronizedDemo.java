package com.hdicos.baidu.designpattern;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName SynchronizedDemo.java
 * @Description TODO
 * @createTime 2021年06月25日 17:00:00
 */
public class SynchronizedDemo {
    public void method() {
        synchronized (this) {
            System.out.println("sychronized 代码块");
        }
    }
}
