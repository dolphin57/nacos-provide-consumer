package com.eric.feign.client.fallback;

import com.eric.feign.client.RemoteClient;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Eric Liang
 * @Since: 2020-3-31 22:14
 */
@Component
public class RemoteClientFallback implements RemoteClient {

    @Override
    public String helloNacos() {
        return "请求超时了";
    }
}
