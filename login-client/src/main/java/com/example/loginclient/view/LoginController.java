package com.example.loginclient.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fly
 */
@RestController
@RequestMapping("/login")
/**
 * 在需要动态刷新配置的地方,添加 @RefreshScope 才能实现自动刷新
 */
@RefreshScope
public class LoginController {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;

    @GetMapping("/name")
    public String getNameAndAge(){
        return "年龄为:"+age + ";姓名为:"+name;
    }

}
