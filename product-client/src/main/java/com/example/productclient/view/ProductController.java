package com.example.productclient.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.productclient.service.ProductService;

/**
 * @author fly
 */

@RestController
@RequestMapping("/sell")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public String getSellAndStudent(@PathVariable("id") String id){
        return "1.访问了product系统,端口号为 : "+port+"  ; 2."+productService.getStudentName(id);
    }

}
