package com.zhq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:dubboConfig.xml")
public class DubboConfig {
}
