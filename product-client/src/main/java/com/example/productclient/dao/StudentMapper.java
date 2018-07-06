package com.example.productclient.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author fly
 * value = "STUDENT-CLIENT" 表示你要访问的集群
 * configuration = FeignConfig.class 对feign的配置,需要自定义
 * fallback = HystrixConfig.class 熔断的回调,需要自定义
 */
@FeignClient(value = "STUDENT-CLIENT",configuration = FeignConfig.class,fallback = HystrixConfig.class)
@Repository
public interface StudentMapper {

    /**
     * 访问集群接口 ,
     *  集群接口怎么写,这里就怎么写
     * @param id
     * @return
     */
    @GetMapping("/admin/{id}")
    String getStudent(@PathVariable("id") String id);

}
