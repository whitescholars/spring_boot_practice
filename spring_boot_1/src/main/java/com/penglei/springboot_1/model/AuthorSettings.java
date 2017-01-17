package com.penglei.springboot_1.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by pl on 2017/1/13.
 */
@Component
@ConfigurationProperties(prefix = "author",locations = {"classpath:config/config.properties"})
public class AuthorSettings {
    private String name;
    private String password;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}