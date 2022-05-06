package com.hdicos.baidu.thread;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName DeadLockDemo.java
 * @Description TODO
 * @createTime 2021年06月25日 16:34:00
 */
public class DeadLockDemo {
    private static Object resoure1 = new Object();
    private static Object resoure2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resoure1) {
                System.out.println(Thread.currentThread() + "get resoure1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                System.out.println(Thread.currentThread() + "waiting get resoure2");
                synchronized (resoure2) {
                    System.out.println(Thread.currentThread() + "get resoure2");
                }
            }
        }, "线程 1").start();

        new Thread(() -> {
            synchronized (resoure1) {
                System.out.println(Thread.currentThread() + "get resoure2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resoure1");
                synchronized (resoure2) {
                    System.out.println(Thread.currentThread() + "get resoure1");
                }
            }
        }, "线程 2").start();

    }

}


