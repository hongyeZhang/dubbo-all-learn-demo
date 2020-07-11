package com.zhq.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhq.AsyncService;

import java.util.concurrent.TimeUnit;

@Service(version = "${demo.service.version}")
public class AsyncServiceImpl implements AsyncService {

    @Override
    public String goodbye(String name) {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("sleep over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "async return result";
    }
}
