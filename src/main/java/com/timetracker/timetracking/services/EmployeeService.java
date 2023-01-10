package com.timetracker.timetracking.services;

import com.timetracker.timetracking.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.timetracker.timetracking.repository.EmployeeRepository;

@Service

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeByID(Long id){
        return employeeRepository.findById(id).get();
    }
    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

}
