package com.liquibaseproject.controller;

import org.springframework.web.bind.annotation.RestController;
import com.liquibaseproject.bean.Employee;
import com.liquibaseproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employeeliquibase")

public class EmployeeController {
	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/all")

	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/view/{id}")

	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Employee employee = employeeService.getEmployeeById(id);
		if (employee != null) {
			return ResponseEntity.ok(employee);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/save")

	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		Employee createEmployee = employeeService.createEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(createEmployee);
	}

	@PutMapping("/update/{id}")

	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		Employee updateEmployee = employeeService.updateEmployee(id, employee);
		if (updateEmployee != null) {
			return ResponseEntity.ok(updateEmployee);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}

