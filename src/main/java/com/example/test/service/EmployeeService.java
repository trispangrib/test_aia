package com.example.test.service;

import com.example.test.data.models.Employee;
import com.example.test.data.payloads.request.EmployeeRequest;
import com.example.test.data.payloads.response.MessageResponse;
import com.example.test.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface EmployeeService {
    MessageResponse createEmployee(EmployeeRequest employeeRequest);
    Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest) throws ResourceNotFoundException;
    void deleteEmployee(Integer employeeId) throws ResourceNotFoundException;
    Employee getASingleEmployee(Integer employeeId) throws ResourceNotFoundException;
    List<Employee> getAllEmployee();
}