package com.hdicos.baidu.sendmessage.proxy;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName AliSmsService.java
 * @Description 实现阿里云发送短信的类
 * @createTime 2021年06月23日 11:08:00
 */
public class AliSmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }

}
