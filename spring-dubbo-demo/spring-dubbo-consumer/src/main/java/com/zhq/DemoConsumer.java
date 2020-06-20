package com.zhq;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @Author ZHQ
 * @Date 2020/6/20 21:34
 */
public class DemoConsumer {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        context.start();

        //
        DemoService demoService = context.getBean(DemoService.class);
        long start = System.currentTimeMillis();
        demoService.sayHelloAsync("zhq");
        // dubbo 2.6 不支持这种调用方式
        Future<String> future = RpcContext.getContext().getFuture();
        String result = future.get();
        System.out.println(result);
        long end = System.currentTimeMillis();
        System.out.println("invoke consume : " + (end - start) / 1000);





    }
}
