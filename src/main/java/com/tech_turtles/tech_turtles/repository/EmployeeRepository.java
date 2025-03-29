package com.tech_turtles.tech_turtles.repository;

import com.tech_turtles.tech_turtles.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all crud database methods

}
