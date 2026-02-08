package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // 1. CREATE (POST)
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // 2. READ ALL (GET)
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // 3. READ BY ID (GET)
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // 4. UPDATE (PUT)
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
        Employee existing = employeeRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedEmployee.getName());
            existing.setDepartment(updatedEmployee.getDepartment());
            existing.setSalary(updatedEmployee.getSalary());
            return employeeRepository.save(existing);
        }
        return null;
    }

    // 5. DELETE (DELETE)
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return "Employee deleted successfully";
        }
        return "Employee not found";
    }
}