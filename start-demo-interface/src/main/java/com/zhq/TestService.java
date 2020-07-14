package com.zhq;

import java.util.concurrent.CompletableFuture;

public interface TestService {

    String sayHello(String name);

    CompletableFuture<String> sayHello2(String name);
}
