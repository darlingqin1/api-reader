package com.leiyi.remote;

import com.leiyi.remote.fallback.ElasticsearchManagerRemoteFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "elasticsearch-manager",fallbackFactory = ElasticsearchManagerRemoteFallbackFactory.class)
public interface ElasticsearchManagerRemote {

    @PostMapping("/test/test")
    String test();
}
