package com.syw.springbootwebmybatis02.mapper;

import com.syw.springbootwebmybatis02.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {
    @Select("select * from employee where id=#{id}")
    public Employee get(Integer id);
}
