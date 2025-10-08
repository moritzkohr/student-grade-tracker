package com.portfolio.studentgradetracker.dialog;

import com.portfolio.studentgradetracker.model.Course;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;

public class AddCourseDialog extends Dialog<Course> {
    private TextField courseNameField;
    private TextField courseCodeField;
    private String schoolType;

    public AddCourseDialog(String schoolType) {
        this.schoolType = schoolType;
    }

    public AddCourseDialog(Course course, String schoolType) {
        this.schoolType = schoolType;
        this.courseNameField.setText(course.getCourseName());
        this.courseCodeField.setText(course.getCourseCode());
    }

    //TODO: Implement setup UI Method
    public void setupUI(){

    }

    //TODO: Implement validate input
    public boolean validateInput(){
        return true;
    }

    //TODO: implement getCourse
    public Course getCourse(){
        return new Course(courseNameField.getText(), courseCodeField.getText(), schoolType);
    }

    //TODO: Implement method to show validation error
    public void showValidationError(String errorMessage){

    }
}
