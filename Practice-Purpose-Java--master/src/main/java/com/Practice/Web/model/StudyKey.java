package com.Practice.Web.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StudyKey implements Serializable {
    private int regNo;
    private int courseId;

    public StudyKey() {
    }


    public StudyKey(int regNo, int courseId) {
        this.regNo = regNo;
        this.courseId = courseId;
    }


    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyKey that = (StudyKey) o;
        return regNo == that.regNo && courseId == that.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNo, courseId);
    }
}
