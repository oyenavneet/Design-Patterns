package com.oyenavneet.designpatterns.singleton.globalconfig.service;

import org.springframework.stereotype.Service;

@Service
public class ConfigManager {

    private String APP_NAME = "Singleton APP";

    public String getAppName() {
        return APP_NAME;
    }
    public void setAppName(String appName) {
        APP_NAME = appName;
    }
}
