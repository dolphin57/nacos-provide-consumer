package com.eric.config.controller.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Eric Liang
 * @Since: 2020-4-1 9:58
 */
@RestController
@RefreshScope
public class HelloController {
    @Value(value = "${nacos.config}")
    private String config;

    @RequestMapping("/getValue")
    public String getValue() {
        return config;
    }
}
