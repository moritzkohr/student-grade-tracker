package com.portfolio.studentgradetracker.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Grade implements Comparable<Grade>, Serializable {
    private static final long serialVersionUID = 1L;

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

    public boolean isPassingGrade() {
        if ("SECONDARY".equals(schoolType)) {
            return gradeValue <= 4.0;
        } else {
            return gradeValue >= 5.0;
        }
    }

    public String getGradeDescription() {
        if ("SECONDARY".equals(schoolType)) {
            if (gradeValue <= 1.5) return "Sehr gut";
            if (gradeValue <= 2.5) return "Gut";
            if (gradeValue <= 3.5) return "Befriedigend";
            if (gradeValue <= 4.5) return "Ausreichend";
            if (gradeValue <= 5.5) return "Mangelhaft";
        } else {
            if (gradeValue >= 13) return "Sehr gut";
            if (gradeValue >= 10) return "Gut";
            if (gradeValue >= 7) return "Befriedigend";
            if (gradeValue >= 5) return "Ausreichend";
            if (gradeValue >= 1) return "Mangelhaft";
        }
        return "Ungenügend";
    }

    @Override
    public int compareTo(Grade o) {
        return Double.compare(this.gradeValue, o.gradeValue);
    }

    public boolean isValid() {
        return isValidGradeValue(this.gradeValue, this.schoolType);
    }

    private boolean isValidGradeValue(double gradeValue, String schoolType) {
        if ("SECONDARY".equals(schoolType)) {
            return gradeValue >= 1.0 && gradeValue <= 6.0;
        } else if ("HIGH_SCHOOL".equals(schoolType)) {
            return gradeValue >= 0 && gradeValue <= 15;
        }
        return false;
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
