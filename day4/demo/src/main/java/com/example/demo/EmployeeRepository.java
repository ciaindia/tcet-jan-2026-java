package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
    // Standard CRUD operations are inherited automatically
}