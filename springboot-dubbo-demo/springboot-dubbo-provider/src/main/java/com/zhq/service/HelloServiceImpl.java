package com.zhq.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhq.HelloService;

/**
 * @Author ZHQ
 * @Date 2020/6/20 10:21
 */
@Service(version = "${demo.service.version}")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ",This is springboot-dubbo test";
    }
}
