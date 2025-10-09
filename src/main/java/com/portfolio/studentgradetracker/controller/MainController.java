package com.portfolio.studentgradetracker.controller;

import com.portfolio.studentgradetracker.model.Course;
import com.portfolio.studentgradetracker.model.Student;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;

public class MainController {
    private Student currentStudent;
    @FXML
    private TableView<Course> courseTableView;
    @FXML
    private TableColumn<Course, String> courseNameColumn;
    @FXML
    private TableColumn<Course, String> courseCodeColumn;
    @FXML
    private TableColumn<Course, String> averageGradeColumn;
    @FXML
    private TableColumn<Course, String> gradeCountColumn;
    @FXML
    private Label gpaLabel;
    @FXML
    private Label studentNameLabel;
    @FXML
    private BarChart<String, Number> gradeChart;
    @FXML
    private MenuItem saveMenuItem;
    @FXML
    private MenuItem loadMenuItem;
    @FXML
    private Button addCourseButton;
    @FXML
    private Button removeCourseButton;
    @FXML
    private Button viewCourseButton;

    @FXML
    public void initialize(){
        setupTableColumns();
        loadStudentData();
        refreshDashboard();
        setupEventHandlers();
    }

    //TODO: Implement method to setup table columns
    private void setupTableColumns(){

    }

    //TODO: Implement method to load student data
    private void loadStudentData(){

    }

    //TODO: Implement method to refresh dashboard
    private void refreshDashboard(){

    }

    //TODO: Implement method to setup event handlers
    private void setupEventHandlers(){

    }
}
