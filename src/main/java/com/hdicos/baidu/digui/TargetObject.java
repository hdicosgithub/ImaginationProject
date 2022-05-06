package com.hdicos.baidu.digui;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName TargetObject.java
 * @Description TODO
 * @createTime 2021年06月23日 09:16:00
 */
public class TargetObject {
    private String value;

    public TargetObject() {
        value = "JAVAGUID";
    }

    public void publicMethod(String s) {
        System.out.println("I love：" + s);
    }

    public void privateMethod() {
        System.out.println("values:" + value);
    }

}
