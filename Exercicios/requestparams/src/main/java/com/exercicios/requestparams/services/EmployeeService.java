package com.exercicios.requestparams.services;

import com.exercicios.requestparams.entities.Employee;
import com.exercicios.requestparams.repositories.EmployeeRepository;
import com.exercicios.requestparams.specifications.EmployeeSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(String firstName, String department, BigDecimal minSalary, LocalDate hireDateAfter, LocalDate hireDateBefore, Boolean active) {
        Specification<Employee> spec = Specification
                .where(EmployeeSpecification.firstNameContains(firstName))
                .and(EmployeeSpecification.hasDepartment(department))
                .and(EmployeeSpecification.hasMinSalary(minSalary))
                .and(EmployeeSpecification.hiredAfter(hireDateAfter))
                .and(EmployeeSpecification.hiredBefore(hireDateBefore))
                .and(EmployeeSpecification.isActive(active));

        return employeeRepository.findAll(spec);
    }
}
