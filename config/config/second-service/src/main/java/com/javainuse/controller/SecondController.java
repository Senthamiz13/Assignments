package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
@RefreshScope
public class SecondController {
    
    @Value("${my.name}")
    public String name;

    @GetMapping("/message")
    public String test(){
        return "Hello JavaInUse Called in Second Service  " + name;
    }

}
