package com.hdicos.baidu.sendmessage.service.impl;

import com.hdicos.baidu.sendmessage.service.SmsService;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName SmsServiceImpl.java
 * @Description TODO
 * @createTime 2021年06月23日 10:50:00
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
