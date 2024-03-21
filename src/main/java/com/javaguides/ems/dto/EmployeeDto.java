package com.javaguides.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dustin.hsieh
 * 2024/3/13 下午 04:03
 * Description: Employee data model
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
