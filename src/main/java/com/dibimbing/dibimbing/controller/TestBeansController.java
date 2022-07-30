package com.dibimbing.dibimbing.controller;

import com.dibimbing.dibimbing.model.TestBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/v1/praktek/")
class TestBeansController {
    @Autowired  // Depedecny Injection
    TestBeans testBeans;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return   testBeans.appSaya();
    }
}

