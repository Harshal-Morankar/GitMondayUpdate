package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/saveData")
    public Employee saveData(@RequestBody Employee employee){
        return employeeServiceImpl.saveData(employee);
    }

    @GetMapping("/getData")
    public List<Employee>getAllData(){
    return employeeServiceImpl.getAllData();
    }


    @PutMapping("/updateData/{employeeId}")
    public Employee updateData(@PathVariable int employeeId, @RequestBody Employee employee){
        return employeeServiceImpl.updateData(employee);
    }

    @DeleteMapping("/deleteData/{employeeId}")
    public String deleteData(@PathVariable int employeeId){
        employeeServiceImpl.deleteData(employeeId);
        return "Product Data Deleted Successfully";
    }

}
