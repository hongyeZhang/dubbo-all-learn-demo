package com.zhq;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ",This is springboot-dubbo test";
    }
}
