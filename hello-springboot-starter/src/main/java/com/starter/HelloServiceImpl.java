package com.starter;

import org.springframework.beans.factory.annotation.Autowired;

/**
* @Author LBS59
* @Description 业务接口实现类
* @Date 22:10 2022/5/17
**/
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloProperties helloProperties;

    @Override
    public void sayHello() {
        System.out.println(helloProperties.getName() + ": hello world!");
    }
}
