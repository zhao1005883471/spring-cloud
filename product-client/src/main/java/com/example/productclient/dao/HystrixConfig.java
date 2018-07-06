package com.example.productclient.dao;

import org.springframework.context.annotation.Configuration;

/**
 * @author fly
 * 必须实现 StudentMapper(自定义),
 */
@Configuration
public class HystrixConfig implements StudentMapper {
    /**
     * @param id
     * @return
     */
    @Override
    public String getStudent(String id) {
        return "在调用student系统的getStudent()方法时,出现了异常";
    }
}
