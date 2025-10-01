package com.portfolio.studentgradetracker.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Course implements Serializable {
    private String courseName;
    private String courseCode;
    private String schoolType;
    private ArrayList<Grade> grades;
    private LocalDateTime dateAdded;

    public Course(String courseName, String courseCode, String schoolType) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.schoolType = schoolType;
        this.grades = new ArrayList<>();
        this.dateAdded = LocalDateTime.now();
    }

    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    public void removeGrade(Grade grade) {
        this.grades.remove(grade);
    }

    //TODO: create method to calculate course average
    public double calculateCourseAverage(){
        return 0;
    }

    //TODO: create method to get highest grade
    public Grade getHighestGrade(){
        return null;
    }

    //TODO: create method to get lowest grade
    public Grade getLowestGrade(){
        return null;
    }

    public int getGradeCount(){
        return this.grades.size();
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    //TODO: create method to get grade trend
    public String getGradeTrend(){
        return null;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }
}
