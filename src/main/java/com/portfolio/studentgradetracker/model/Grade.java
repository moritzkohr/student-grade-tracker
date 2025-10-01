package com.portfolio.studentgradetracker.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Grade implements Comparable<Grade>, Serializable {
    private double gradeValue;
    private String gradeType;
    private double weight;
    private LocalDateTime dateAdded;
    private String schoolType;

    public Grade(double gradeValue, String gradeType, String schoolType) {
        this.gradeValue = gradeValue;
        this.gradeType = gradeType;
        this.schoolType = schoolType;
        this.dateAdded = LocalDateTime.now();
        this.weight = 1.0;
    }

    public Grade(double gradeValue, String gradeType, double weight, String schoolType) {
        this.gradeValue = gradeValue;
        this.gradeType = gradeType;
        this.weight = weight;
        this.schoolType = schoolType;
        this.dateAdded = LocalDateTime.now();
    }

    //TODO: create method to determine if grade is passing, based on the school type
    public boolean isPassingGrade() {
        return true;
    }

    //TODO: create method to get grade gradeType based on the grade value
    public String getGradeDescription() {
        return "";
    }

    @Override
    public int compareTo(Grade o) {
        return Double.compare(this.gradeValue, o.gradeValue);
    }

    //TODO: create method to determine if grade is in the valid range
    public boolean isValid(){
        return true;
    }

    public double getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(double gradeValue) {
        this.gradeValue = gradeValue;
    }

    public String getGradeType() {
        return gradeType;
    }

    public void setGradeType(String gradeType) {
        this.gradeType = gradeType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }
}
