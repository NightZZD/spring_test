package com.example.demo.controller.pk;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pk")
public class BotInfoController {
    @RequestMapping("/getbotinfo")
    public List<Map<String,String>> getBotInfo() {
        List<Map<String,String>> botInfo = new LinkedList<>();
        Map<String,String> bot1 = new HashMap<>();
        bot1.put("name", "MyBot");
        bot1.put("version", "1.0");
        bot1.put("description", "A simple chat bot.");
        botInfo.add(bot1);
        Map<String,String> bot2 = new HashMap<>();
        bot2.put("name", "HelperBot");
        bot2.put("version", "2.1");
        bot2.put("description", "Assists with various tasks.");
        botInfo.add(bot2);
        return botInfo;
    }
}
