package com.javaguides.ems.repository;

import com.javaguides.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dustin.hsieh
 * 2024/3/13 下午 03:59
 * Description:
 **/

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
