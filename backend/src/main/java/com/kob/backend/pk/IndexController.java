package com.kob.backend.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pk")
public class IndexController {
    @RequestMapping("/index")
    public Map<String, String> index() {
        Map<String, String> bot1 = new HashMap<>();
        bot1.put("name","tiger");
        bot1.put("rating","1500");
        return bot1;
    }

}
