package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class TemplateTestController {
    private static final Logger log = LoggerFactory.getLogger(TemplateTestController.class);

    @GetMapping("/heartbeat")
    public boolean heartbeat() {
        log.info("Heartbeat ok");
        return true;
    }
}
