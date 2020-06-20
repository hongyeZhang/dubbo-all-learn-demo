package com.zhq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ZHQ
 * @Date 2020/6/20 20:33
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        context.start();
        HelloService helloService = context.getBean(HelloService.class);
        String result = helloService.sayHello("zhq");
        System.out.println(result);
    }
}
