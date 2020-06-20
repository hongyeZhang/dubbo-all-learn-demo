package com.zhq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ZHQ
 * @Date 2020/6/20 13:45
 */
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        context.start();
        HelloService bean = context.getBean(HelloService.class);
        System.out.println(bean);
        System.in.read();
    }
}
