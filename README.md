# EmployeeListDemoSpringBootBackend
Uses Spring Boot and React to create Employee List Demo

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.0-M2/maven-plugin/reference/html/)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.3.0-M2/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.0-M2/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

## System Requirements
- IntelliJ Idea
- Spring Boot 3
- Spring Data JPA (Hibernate 6)
- JDK 17 or newer
- Maven
- MySQL
- Postman Client

## Third party Lib
- Lombok

## Build CRUD REST APIs for Employee Management Module
- Add Employees
- Get Employees
- Get All Employees
- Update Employees
- Delete Employees

## SQL Model
```java
package com.javaguides.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dustin.hsieh
 * 2024/3/13 下午 03:42
 * Description:employee DB model
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
```
## MySQL Table
![mySQL](https://github.com/code09128/EmployeeListDemoSpringBootBackend/assets/32324308/bf1d91a2-8878-4dab-a61a-7ea4e31d5712)

## EmployeeService
```java
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
```
## Post man API Test
API URL: http://localhost:8080/api/employees
![postmanAPI](https://github.com/code09128/EmployeeListDemoSpringBootBackend/assets/32324308/cab4074e-c2f5-47e0-a687-7e600dbc85a0)
