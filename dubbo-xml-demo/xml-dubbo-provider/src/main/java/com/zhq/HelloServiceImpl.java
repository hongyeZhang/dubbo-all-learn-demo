package com.zhq;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author ZHQ
 * @Date 2020/6/20 17:32
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String msg) {
        System.out.println("客户端传过来的信息:" + msg);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(calendar.getTime());
        return "服务端返回的信息：" + msg + ",当前时间：" + currentTime;
    }
}
