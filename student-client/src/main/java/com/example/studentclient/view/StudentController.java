package com.example.studentclient.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fly
 */
@RestController
@RequestMapping("/admin")
public class StudentController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/{id}")
    public String getStudent(@PathVariable("id") String id){
        return "你访问的是学生管理模块,被访问服务的端口号是:"+port + ", 传进来的参数为 ID="+id;
    }

}
