package com.example.demo.controller.pk;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pk")
public class BotInfoController {
    @RequestMapping("/getbotinfo")
    public List<String> getBotInfo() {
        List<String> botInfo = java.util.Arrays.asList("BotName: ExampleBot", "Version: 1.0", "Status: Active");
        return botInfo;
    }
}
