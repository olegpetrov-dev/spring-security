package com.olegpetrov.security.other.controller;

import com.olegpetrov.security.other.dto.EmployeeDto;
import com.olegpetrov.security.other.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/{id}")
    public EmployeeDto getEmployeeById(@PathVariable final Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDto> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
