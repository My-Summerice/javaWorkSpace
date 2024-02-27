package org.example.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthController {
    // http://127.0.0.1:8080/health
    @RequestMapping("/health")
    @ResponseBody
    public String hello() {
        return "OK";
    }
}
