package com.zhq;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
public class AsyncController {

    private static final Logger logger = LoggerFactory.getLogger(AsyncController.class);

    @Reference(version = "{demo.service.version}", async = true)
    private AsyncService asyncService;

    @RequestMapping(value = "/async/bye")
    public String sayGoodBye() throws Exception {
        asyncService.goodbye("zhq");
        logger.info("after async invoke");
        Future<String> future = RpcContext.getContext().getFuture();
        String result = future.get();
        logger.info("result {}", result);
        return result;
    }


}
