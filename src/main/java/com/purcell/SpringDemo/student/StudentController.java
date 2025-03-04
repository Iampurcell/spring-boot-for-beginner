package com.purcell.SpringDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController //it tells Spring that this class will handle HTTP requests and return JSON responses
@RequestMapping("/api/v1/students") //define which URL this controller should respond to and map HTTP requests to specific handler methods.
public class StudentController {

    private StudentService service;//This bind StudentService to StudentController

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return service.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudent() {
        return service.findAllStudent();
    }

    @PutMapping
    public Student UpdateStudent(@RequestBody Student student){
        return service.update(student);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email){
         service.delete(email);
    }
}
