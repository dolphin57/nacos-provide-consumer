package com.eric.feign.client;

import com.eric.feign.client.fallback.RemoteClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: Eric Liang
 * @Since: 2020-3-31 20:59
 */
@FeignClient(name = "nacos-provide", fallback = RemoteClientFallback.class)
public interface RemoteClient {
    @GetMapping("/hello")
    String helloNacos();
}
