package com.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
* @Author LBS59
* @Description 配置类
* @Date 22:11 2022/5/17
**/
@ConfigurationProperties(prefix = "com.starter")
public class HelloProperties {
    /**
     * 姓名
     */
    private String name = "libaoshan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
