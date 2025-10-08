package com.portfolio.studentgradetracker.dialog;

import com.portfolio.studentgradetracker.model.Grade;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;

public class AddGradeDialog extends Dialog<Grade> {

    private TextField gradeValueField;
    private TextField typeField;
    private TextField weightField;
    private String schoolType;
    private Grade existingGrade;

    public AddGradeDialog(String schoolType){
        this.schoolType = schoolType;
    }

    public AddGradeDialog(Grade grade, String schoolType){
        this.schoolType = schoolType;
        this.existingGrade = grade;
    }

    //TODO: implement setupUI
    public void setupUI(){

    }

    //TODO: Implement method to validate the input
    public boolean validateInput(){
        return true;
    }

    //TODO: Implement method to get the existing grade
    public Grade getExistingGrade(){
        return existingGrade;
    }

    //TODO: Implement method to display an error message
    public void showValidationError(String errorMessage){

    }
}
