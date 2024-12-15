package com.Practice.Web.repositary;

import com.Practice.Web.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}

