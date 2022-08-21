package com.accenture.lkm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class MessageRestController {

    @Value("${SimpleValue:Hello default}")
    private String message1;

    @Value("${cst_property2:Hello default}")
    private String message2;

    @Value("${cst_property1:Hello default}")
    private String message3;

    @RequestMapping("/getMessage")
    public String getMessage() {
        return this.message1+", "+message2+", "+message3;
    }
}