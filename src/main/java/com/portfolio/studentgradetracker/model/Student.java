package com.portfolio.studentgradetracker.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private String schoolType;
    private String gradeLevel;
    private ArrayList<Course> courses;
    private LocalDateTime profileCreatedDate;

    public Student(String name, String schoolType, String gradeLevel) {
        this.name = name;
        this.schoolType = schoolType;
        this.gradeLevel = gradeLevel;
        this.courses = new ArrayList<>();
        this.profileCreatedDate = LocalDateTime.now();
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }

    //TODO: create method to get course by code
    public Course getCourseByCode(String code){
        return null;
    }

    //TODO: create method to calculate overall grade
    public double calculateOverallGrade() {
        return 0;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public LocalDateTime getProfileCreatedDate() {
        return profileCreatedDate;
    }

    public void setProfileCreatedDate(LocalDateTime profileCreatedDate) {
        this.profileCreatedDate = profileCreatedDate;
    }
}
