package com.zhq;

/**
 * @Author ZHQ
 * @Date 2020/6/20 20:23
 */
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String name) {
        return "provider success";
    }

}
