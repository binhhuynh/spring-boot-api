package com.htb.service;

import com.htb.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee getEmployee(int id);

    void createEmp(Employee employee);

    void deleteById(int id);

    void updateById(Employee employee);
}
