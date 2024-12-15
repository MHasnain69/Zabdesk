package com.Practice.Web.controller;

import com.Practice.Web.model.Course;
import com.Practice.Web.repositary.CourseRepo;
import com.Practice.Web.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;
    @GetMapping("/get")
    public ResponseEntity<List<Course>> getCourse(){
        try{
            return new ResponseEntity<>(courseService.getCourse(), HttpStatus.CREATED) ;
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/add")
    public ResponseEntity<?> addCourse(@RequestBody Course course){
        try{
            Course course1 = courseService.addCourse(course);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @Autowired
    CourseRepo courseRepo;

    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable Integer id, @RequestBody Course updatedCourse) {
        Optional<Course> existingCourseOptional = courseRepo.findById(id);
        if (existingCourseOptional.isPresent()) {
            Course existingCourse = existingCourseOptional.get();

            existingCourse.setCourseName(updatedCourse.getCourseName());
            existingCourse.setCourseTeacher(updatedCourse.getCourseTeacher());
            existingCourse.setCreaditHours(updatedCourse.getCreaditHours());

            Course savedCourse = courseRepo.save(existingCourse);
            return ResponseEntity.ok(savedCourse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }









}
