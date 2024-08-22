package com.exercicios.requestparams.controllers;

import com.exercicios.requestparams.entities.Employee;
import com.exercicios.requestparams.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees(
            @RequestParam(name = "first_name", required = false) String firstName,
            @RequestParam(name = "department", required = false) String department,
            @RequestParam(name = "min_salary", required = false) BigDecimal minSalary,
            @RequestParam(name = "hired_after", required = false) LocalDate hireDateAfter,
            @RequestParam(name = "hired_before", required = false) LocalDate hireDateBefore,
            @RequestParam(name = "is_active", required = false) Boolean isActive) {

        return ResponseEntity.ok(employeeService.getAllEmployees(firstName, department, minSalary, hireDateAfter, hireDateBefore, isActive));
    }
}
