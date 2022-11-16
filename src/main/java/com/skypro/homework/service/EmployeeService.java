package com.skypro.homework.service;

import com.skypro.homework.model.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    private final Map<Integer, Employee> employees = new HashMap<>();


}
