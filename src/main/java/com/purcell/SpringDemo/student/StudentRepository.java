package com.purcell.SpringDemo.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByEmail(String email);

    void deleteByemail(String email);
}
