package com.zhq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ZHQ
 * @Date 2020/6/20 17:36
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        context.start();
        HelloService helloService = context.getBean("helloService", HelloService.class);
        String hello = helloService.sayHello("我在学习dubbo");
        System.out.println(hello);
    }
}
