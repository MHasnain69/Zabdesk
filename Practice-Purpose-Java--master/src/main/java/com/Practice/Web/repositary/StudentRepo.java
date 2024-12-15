package com.Practice.Web.repositary;

import com.Practice.Web.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}

