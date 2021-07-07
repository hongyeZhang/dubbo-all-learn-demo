package com.zhq;

import java.util.concurrent.CompletableFuture;

/**
 * @Author ZHQ
 * @Date 2020/6/19 9:26
 */
public interface DemoService {

    String sayHello(String name);

    CompletableFuture<String> sayHelloAsync(String name);

}
