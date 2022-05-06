package com.hdicos.baidu.digui;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName ReflexTest.java
 * @Description TODO
 * @createTime 2021年06月23日 10:00:00
 */
public class ReflexTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        /**
         * 获取targetObject类的Class对象并创建TargetObject实例
         */
        Class<?> tagetClass = Class.forName("com.hdicos.baidu.digui.TargetObject");
        TargetObject targetObject = (TargetObject) tagetClass.newInstance();

        /**
         * 获取类中定义的方法
         */

        Method[] md = tagetClass.getDeclaredMethods();
        for (Method method : md) {
            System.out.println(method.getName());
        }
        /**
         * 获取指定方法并调用
         */
        Method method = tagetClass.getDeclaredMethod("publicMethod", String.class);
        method.invoke(targetObject, "hedesheng");
        /**
         * 获取指定参数并对其修改
         */
        Field field = tagetClass.getDeclaredField("value");
        //为了对类中的参数进行修改我们取消安全检查
        field.setAccessible(true);
        field.set(targetObject, "life is fucking movie!");
        /**
         * 调用private的方法
         */
        Method privateMethod = tagetClass.getDeclaredMethod("privateMethod");
        //取消安全检查
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);

    }
}
