package com.skypro.homework.service;

import com.skypro.homework.model.Employee;
import com.skypro.homework.record.EmployeeRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    private final Map<Integer, Employee> employees = new HashMap<>();

    public Collection<Employee> getAllEmployees() {
        return this.employees.values();
    }

    public Employee addEmployee(EmployeeRequest employeeRequest) {
        if (employeeRequest.getFirstName() == null || employeeRequest.getLastName() == null) {
            throw new IllegalArgumentException("Данные работника необходимо заполнить!");
        }
        Employee employee = new Employee(employeeRequest.getFirstName(),
                employeeRequest.getLastName(),
                employeeRequest.getDepartment(),
                employeeRequest.getSalary());
        this.employees.put(employee.getId(), employee);
        return employee;
    }

    public int getSalarySum() {
        return employees.values().stream().
                mapToInt(Employee::getSalary)
                .sum();
    }

    public int getEmployeeMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public int getEmployeeMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();

            }
        }
        return maxSalary;
    }

    public int getEmployeesMoreSalary() {
        for (Employee employee : employees.values()) {
            double averageSalary = employee.getSalary()/employee.getId();
            if (employee != null && employee.getSalary() > averageSalary) {
            }
        }
        return getEmployeesMoreSalary();
    }
}
