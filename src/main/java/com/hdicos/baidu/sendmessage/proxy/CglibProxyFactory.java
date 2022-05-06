package com.hdicos.baidu.sendmessage.proxy;

import com.hdicos.baidu.sendmessage.Interceptor.DebugMethodInterceptor;
import net.sf.cglib.proxy.Enhancer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName CglibProxyFactory.java
 * @Description 获取代理类
 * @createTime 2021年06月23日 11:24:00
 */
public class CglibProxyFactory {
    public static Object getProxy(Class<?> clazz) {
        //创建动态代理增强类
        Enhancer enhancer = new Enhancer();
        //设置类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
        //设置被代理
        enhancer.setSuperclass(clazz);
        //设置方法拦截器
        enhancer.setCallback(new DebugMethodInterceptor());
        // 创建代理器
        
        //循环map
        Map<String,String> map=new HashMap<String,String>();
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            
        }
        return enhancer.create();
    }
}
