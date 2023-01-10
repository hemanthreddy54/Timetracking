package com.timetracker.timetracking.controllers;

import com.timetracker.timetracking.models.Employee;
import com.timetracker.timetracking.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable Long id) {
       return employeeService.getEmployeeByID(id);
    }
    @PostMapping("/emp/create")
    public Employee createEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);
        return employee;
    }


}
