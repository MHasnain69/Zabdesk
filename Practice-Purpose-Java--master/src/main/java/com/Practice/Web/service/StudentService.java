package com.Practice.Web.service;

import com.Practice.Web.model.Student;
import com.Practice.Web.repositary.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo stdRepo ;

    public ResponseEntity<List<Student>> getStudents() {
        try {
            return new ResponseEntity<>(stdRepo.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Student addStudent(Student student) {
        return stdRepo.save(student);
    }

}

