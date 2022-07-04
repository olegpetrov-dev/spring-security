package com.olegpetrov.security.other.converters;

import com.olegpetrov.security.other.dto.DepartmentDto;
import com.olegpetrov.security.other.dto.EmployeeDto;
import com.olegpetrov.security.other.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class EmployeeToEmployeeDtoConverter implements Converter<Employee, EmployeeDto> {

    private final ConversionService conversionService;

    @Override
    public EmployeeDto convert(final Employee employee) {
        return EmployeeDto.builder()
                .id(employee.getId())
                .name(employee.getName())
                .department(conversionService.convert(employee.getDepartment(), DepartmentDto.class))
                .build();
    }
}
