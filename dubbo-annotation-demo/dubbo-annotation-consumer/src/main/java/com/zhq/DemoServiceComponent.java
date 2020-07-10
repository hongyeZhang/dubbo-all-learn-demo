package com.zhq;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component("demoServiceComponent")
public class DemoServiceComponent implements DemoService {
    @Reference
    private DemoService demoService;

    @Override
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }

    @Override
    public CompletableFuture<String> sayHelloAsync(String name) {
        return null;
    }
}
