package com.javaguides.ems.service;

import com.javaguides.ems.dto.EmployeeDto;
import com.javaguides.ems.entity.Employee;

import java.util.List;

/**
 * @author Dustin.hsieh
 * 2024/3/13 下午 05:12
 * Description:
 **/
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);
    void deleteEmployee(Long employeeId);
}
