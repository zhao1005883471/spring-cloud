package com.example.productclient.service;

import com.example.productclient.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fly
 */
@Service
public class ProductService {

    @Autowired
    StudentMapper studentMapper;

    public String getStudentName(String id){
        return studentMapper.getStudent(id);
    }

}
