package com.leiyi.controller;


import com.leiyi.remote.ElasticsearchManagerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private ElasticsearchManagerRemote elasticsearchManagerRemote;

    @PostMapping("/test")
    public String test(){
        return elasticsearchManagerRemote.test();
    }
}
