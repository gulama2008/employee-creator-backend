package io.nology.siyuliu.employeecreatorbackend.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

@Autowired
private EmployeeRepository employeeRepository;
    
public List<Employee> getAll() {
    return this.employeeRepository.findAll();
}

public Optional<Employee> getById(Long id) {
    return this.employeeRepository.findById(id);
}
    
}
