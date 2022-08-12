package com.yishu.cloud.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/yishu/test/01")
    public String test01(@RequestBody String str){

        String msg="本地:";
        System.out.println(str);;
        return msg;
    }

}
