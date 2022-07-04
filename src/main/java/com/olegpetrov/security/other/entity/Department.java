package com.olegpetrov.security.other.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Department {

    @Id
    private int id;

    private String name;
}
