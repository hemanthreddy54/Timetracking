package com.timetracker.timetracking.repository;

import com.timetracker.timetracking.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
