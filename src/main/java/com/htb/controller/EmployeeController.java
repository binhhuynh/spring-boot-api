package com.htb.controller;

import com.htb.entity.Employee;
import com.htb.service.EmployeeService;
import com.htb.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {
        employeeService.createEmp(employee);
        return "Created";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteById(id);
        return "Deleted";
    }

    @PutMapping("/{id}")
    public String updateEmployee(@RequestBody Employee employee) {
        employeeService.updateById(employee);
        return "Updated";
    }
}
