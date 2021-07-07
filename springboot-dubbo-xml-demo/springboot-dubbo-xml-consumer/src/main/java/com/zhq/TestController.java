package com.zhq;

import com.alibaba.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test/sayHello")
    public String sayHello() throws Exception {
        String zhq = testService.sayHello("zhq");
        logger.info("instant result = {}", zhq);
        Future<String> future = RpcContext.getContext().getFuture();
        logger.info("after async invoke");
        String result = future.get();
        return result;
    }

    @RequestMapping(value = "/test/sayHello2")
    public String sayHello2() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = testService.sayHello2("zhq");
        logger.info("after async process");
        String result = future.get();
        return result;
    }


}
