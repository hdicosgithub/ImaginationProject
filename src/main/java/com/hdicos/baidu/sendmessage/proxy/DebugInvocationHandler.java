package com.hdicos.baidu.sendmessage.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName DebugInvocationHandler.java
 * @Description TODO
 * @createTime 2021年06月23日 10:54:00
 */
public class DebugInvocationHandler implements InvocationHandler {
    /**
     * 代理中的真是对象
     */
    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }


    /**
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用方法之前，我们可以先添加自己操作
        System.out.println("before method " + method.getName());
        Object result = method.invoke(target, args);
        //调用方法之后，我们同样可以自己添加操作
        System.out.println("after method:" + method.getName());
        return result;
    }
}
