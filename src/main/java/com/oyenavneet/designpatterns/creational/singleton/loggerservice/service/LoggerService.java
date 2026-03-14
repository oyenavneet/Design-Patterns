package com.oyenavneet.designpatterns.creational.singleton.loggerservice.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LoggerService {
    public void logInfo(String message) {
        System.out.println(LocalDateTime.now() + " [INFO] " + message);
    }

    public void logError(String message) {
        System.out.println(LocalDateTime.now() + " [ERROR] " + message);
    }
}
