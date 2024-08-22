package com.exercicios.requestparams.specifications;

import com.exercicios.requestparams.entities.Employee;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeSpecification {
    public static Specification<Employee> firstNameContains(String firstName) {
        return (root, query, cb) ->
                firstName == null
                        ? null
                        : cb.like(cb.lower(root.get("firstName")), "%" + firstName.toLowerCase() + "%");
    }

    public static Specification<Employee> hasDepartment(String departmentName) {
        return (root, query, cb) ->
                departmentName == null
                        ? null
                        : cb.equal(cb.lower(root.get("department")), departmentName.toLowerCase());
    }

    public static Specification<Employee> hasMinSalary(BigDecimal minSalary) {
        return (root, query, cb) ->
                minSalary == null
                        ? null
                        : cb.greaterThanOrEqualTo(root.get("salary"), minSalary);
    }

    public static Specification<Employee> hiredAfter(LocalDate date) {
        return (root, query, cb) -> date == null ? null : cb.greaterThanOrEqualTo(root.get("hireDate"), date);
    }

    public static Specification<Employee> hiredBefore(LocalDate date) {
        return (root, query, cb) -> date == null ? null : cb.lessThanOrEqualTo(root.get("hireDate"), date);
    }

    public static Specification<Employee> isActive(Boolean isActive) {
        return (root, query, cb) -> isActive == null ? null : cb.equal(root.get("isActive"), isActive);
    }
}
