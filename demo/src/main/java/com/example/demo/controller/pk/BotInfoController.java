package com.example.demo.controller.pk;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pk")
public class BotInfoController {
    @RequestMapping("/getbotinfo")
    public Map<String,String> getBotInfo() {
        Map<String,String> botInfo = new HashMap<>();
        botInfo.put("name", "MyBot");
        botInfo.put("version", "1.0.0");
        botInfo.put("description", "A simple chat bot.");
        botInfo.put("author", "zzd");
        return botInfo;
    }
}
