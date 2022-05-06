package com.hdicos.baidu.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName MultiThread.java
 * @Description 查看Java中的基本的线程
 * @createTime 2021年06月24日 09:55:00
 */
public class MultiThread {
    public static void main(String[] args) {
        //获取Java线程管理的maxBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //不需要获取线程同步的monitor和sychroniizer信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        //遍历线程名称 仅打印线程ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println(threadInfo.getLockOwnerId() + threadInfo.getLockName());
        }
    }
}
