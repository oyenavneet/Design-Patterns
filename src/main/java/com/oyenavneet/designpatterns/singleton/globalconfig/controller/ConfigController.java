package com.oyenavneet.designpatterns.singleton.globalconfig.controller;

import com.oyenavneet.designpatterns.singleton.globalconfig.service.ConfigManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {

    private final ConfigManager configManager;

    public ConfigController(ConfigManager configManager) {
        this.configManager = configManager;
    }

    @GetMapping("/app-name")
    public String getAppName() {
        return configManager.getAppName();
    }
}
