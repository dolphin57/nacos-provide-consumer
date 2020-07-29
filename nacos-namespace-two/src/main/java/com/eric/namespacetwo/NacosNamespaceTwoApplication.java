package com.eric.namespacetwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class NacosNamespaceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosNamespaceTwoApplication.class, args);
    }

    @Value(value = "${nacos.config}")
    private String config;

    @RequestMapping("/getValue")
    public String getValue() {
        return config;
    }
}
