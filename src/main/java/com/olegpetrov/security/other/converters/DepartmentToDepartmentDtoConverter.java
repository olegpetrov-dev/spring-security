package com.olegpetrov.security.other.converters;

import com.olegpetrov.security.other.dto.DepartmentDto;
import com.olegpetrov.security.other.entity.Department;
import org.springframework.core.convert.converter.Converter;

//@Component
public class DepartmentToDepartmentDtoConverter implements Converter<Department, DepartmentDto> {

    @Override
    public DepartmentDto convert(final Department department) {
        return DepartmentDto.builder()
                .id(department.getId())
                .name(department.getName())
                .build();
    }
}
