package com.olegpetrov.security.other.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {

    private Integer id;

    private String name;

    private DepartmentDto department;
}
