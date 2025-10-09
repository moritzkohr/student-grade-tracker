package com.portfolio.studentgradetracker.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;

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

    public double calculateCourseAverage() {
        return GradeCalculator.calculateWeightedAverage(grades);
    }

    public Grade getHighestGrade() {
        return GradeCalculator.findHighestGrade(grades);
    }


    public Grade getLowestGrade() {
        return GradeCalculator.findLowestGrade(grades);
    }

    public int getGradeCount() {
        return grades.size();
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public String getGradeTrend() {
        if (grades.size() < 2) {
            return "Nicht genügend Daten vorhanden";
        }

        int mid = grades.size() / 2;
        ArrayList<Grade> firstHalf = new ArrayList<>(grades.subList(0, mid));
        ArrayList<Grade> secondHalf = new ArrayList<>(grades.subList(mid, grades.size()));

        double firstAvg = GradeCalculator.calculateWeightedAverage(firstHalf);
        double secondAvg = GradeCalculator.calculateWeightedAverage(secondHalf);

        if ("SECONDARY".equals(schoolType)) {
            if (secondAvg < firstAvg - 0.3) {
                return "Durchschnitt verbessert sich";
            } else if (secondAvg > firstAvg + 0.3) {
                return "Durchschnitt verschlechtert sich";
            } else {
                return "Durchschnitt bleibt stabil";
            }
        } else {
            if (secondAvg > firstAvg + 1.0) {
                return "Durchschnitt verbessert sich";
            } else if (secondAvg < firstAvg - 1.0) {
                return "Durchschnitt verschlechtert sich";
            } else {
                return "Durchschnitt bleibt stabil";
            }
        }
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
