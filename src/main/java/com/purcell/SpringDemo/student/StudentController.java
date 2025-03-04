package com.purcell.SpringDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController //it tells Spring that this class will handle HTTP requests and return JSON responses
@RequestMapping("/api/v1/students") //define which URL this controller should respond to and map HTTP requests to specific handler methods.
public class StudentController {

    private StudentService service;//This bind StudentService to StudentController

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> findAllStudent() {
        return service.findAllStudent();
    }
}
