package com.hdicos.baidu.sendmessage.Interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName DebugMethodInterceptor.java
 * @Description 自定义 MethodInterceptor（方法拦截器）
 * @createTime 2021年06月23日 11:11:00
 */
public class DebugMethodInterceptor implements MethodInterceptor {
    /**
     * @param o           被代理的对象（需要被增强的对象）
     * @param method      被拦截的方法（被增强的方法）
     * @param objects     方法入参
     * @param methodProxy 用于调用原始方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 调用方法之前我们可以添加自己的操作
        System.out.println("before send message :" + method.getName());
        Object object = methodProxy.invokeSuper(o, objects);
        // 调用方法之后我们可以添加自己的操作
        System.out.println("after send message:" + method.getName());
        return object;
    }
}
