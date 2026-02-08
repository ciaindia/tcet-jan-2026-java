package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // ✅ CREATE (POST)
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // ✅ READ ALL (GET)
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // ✅ READ BY ID (GET)
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // ✅ UPDATE (PUT)
    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Long id,
            @RequestBody Employee updatedEmployee) {

        Employee existing = employeeRepository.findById(id).orElse(null);

        if (existing == null) {
            return null;
        }

        existing.setName(updatedEmployee.getName());
        existing.setDepartment(updatedEmployee.getDepartment());
        existing.setSalary(updatedEmployee.getSalary());

        return employeeRepository.save(existing);
    }

    // ✅ DELETE (DELETE)
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {

        if (!employeeRepository.existsById(id)) {
            return "Employee not found";
        }

        employeeRepository.deleteById(id);
        return "Employee deleted successfully";
    }
}

