package com.hdicos.baidu.sendmessage.proxy;

import com.hdicos.baidu.sendmessage.service.SmsService;
import com.hdicos.baidu.sendmessage.service.impl.SmsServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName JdkProxyFactory.java
 * @Description TODO
 * @createTime 2021年06月23日 10:59:00
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),//目标类的加载
                target.getClass().getInterfaces(),//代理需要实现的接口可以指定多个
                new DebugInvocationHandler(target)//代理对象对应的自定义 InvocationHandler
        );

    }

    public static void main(String[] args) {
      /*  SmsService smsService=(SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");*/
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
    }
}
