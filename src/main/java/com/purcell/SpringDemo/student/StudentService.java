package com.purcell.SpringDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudent(){
        return List.of(
                new Student (
                        "Danniel",
                        "Purcell",
                        "iampurcell9@gmail.com",
                        LocalDate.now(),
                        22
                ),
                new Student (
                        "Danniel",
                        "Deus",
                        "iamdeus9@gmail.com",
                        LocalDate.now(),
                        23
                )
        );
    }
}
