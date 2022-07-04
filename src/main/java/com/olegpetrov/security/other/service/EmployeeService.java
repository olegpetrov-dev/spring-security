package com.olegpetrov.security.other.service;

import com.olegpetrov.security.other.dto.EmployeeDto;
import com.olegpetrov.security.other.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    private final ConversionService conversionService;

    public EmployeeDto getEmployeeById(final Integer id) {
        return repository.findById(id)
                .map(employee -> conversionService.convert(employee, EmployeeDto.class))
                .orElseThrow();
    }

    public List<EmployeeDto> getAllEmployees() {
        return repository.findAll().stream()
                .map(employee -> conversionService.convert(employee, EmployeeDto.class))
                .collect(toList());
    }
}
