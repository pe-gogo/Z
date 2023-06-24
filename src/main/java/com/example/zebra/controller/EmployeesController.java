package com.example.zebra.controller;

import com.example.zebra.entity.Employees;
import com.example.zebra.entity.Salary;
import com.example.zebra.service.IEmployeesService;
import com.example.zebra.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author SHEN
 * @since 2023-06-09
 */
@RestController
@CrossOrigin
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private IEmployeesService employeesService;

    @Autowired
    private ISalaryService salaryService;

    @GetMapping
    public Object list() {
        List<Employees> list = employeesService.list();
        for(Employees employees : list) {
            System.out.println(employees.getEmployeeId());
            employees.setSalary(String.valueOf(salaryService.getById(employees.getEmployeeId()).getBasicSalary()));
        }
        return list;
    }

    @PostMapping
    public Object add(@RequestBody Employees employees) {
        employeesService.save(employees);
        Salary salary = new Salary();
        salary.setEmployeeId(employees.getEmployeeId());
        salary.setBasicSalary(employees.getSalary());
        return salaryService.save(salary);
    }

    @PutMapping
    public Object update(@RequestBody Employees employees) {
        System.out.println(employees);
        employeesService.updateById(employees);
        Salary salary = new Salary();
        salary.setEmployeeId(employees.getEmployeeId());
        salary.setBasicSalary(employees.getSalary());
        return salaryService.updateById(salary);
    }

    @DeleteMapping
    public Object delete(@RequestParam("employeeId") Integer employeeId) {
        salaryService.removeById(employeeId);
        return employeesService.removeById(employeeId);
    }

}
