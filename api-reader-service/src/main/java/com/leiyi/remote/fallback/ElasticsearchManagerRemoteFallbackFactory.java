package com.leiyi.remote.fallback;

import com.leiyi.remote.ElasticsearchManagerRemote;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ElasticsearchManagerRemoteFallbackFactory implements FallbackFactory<ElasticsearchManagerRemote> {
    @Override
    public ElasticsearchManagerRemote create(Throwable cause) {
        return new ElasticsearchManagerRemote() {
            @Override
            public String test() {
                log.error("ElasticsearchManagerRemote#/test/test 失败,message:{}",cause.getMessage(),cause);
                return "error";
            }
        };
    }
}
