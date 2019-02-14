package com.syw.springbootwebmybatis02.controller;

import com.syw.springbootwebmybatis02.entity.Employee;
import com.syw.springbootwebmybatis02.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;
    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){
    return employeeMapper.get(id);
    }
}
