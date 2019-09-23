package com.gk.starter.controller;

import com.gk.starter.MyLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/9/21
 */
@RestController
@RequestMapping(value =  "/starter")
public class TestController {

    @Autowired
    private MyLogService myLogService;

    @GetMapping(value = "/getInfo")
    public String test() {
        return  myLogService.getInfo();
    }

}
