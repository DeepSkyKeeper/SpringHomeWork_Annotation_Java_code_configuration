package org.sprframework;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Raphsody";
    }
}
