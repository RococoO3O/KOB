package com.kob.backend.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pk")
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "hhh";
    }

}
