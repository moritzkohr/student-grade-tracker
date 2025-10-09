package com.portfolio.studentgradetracker.controller;

import com.portfolio.studentgradetracker.model.Course;
import com.portfolio.studentgradetracker.model.Grade;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CourseViewController {
    private Course currentCourse;
    private MainController mainController;

    @FXML
    private TableView<Grade> gradeTableView;
    @FXML
    private TableColumn<Grade, String> gradeValueColumn;
    @FXML
    private TableColumn<Grade, String> gradeTypeColumn;
    @FXML
    private TableColumn<Grade, String> weightColumn;
    @FXML
    private TableColumn<Grade, String> dateColumn;
    @FXML
    private Label courseNameLabel;
    @FXML
    private Label averageGradeLabel;
    @FXML
    private Label gradeCountLabel;
    @FXML
    private Label trendLabel;
    @FXML
    private LineChart<String, Number> trendChart;
    @FXML
    private Button addGradeButton;
    @FXML
    private Button removeGradeButton;
    @FXML
    private Button editGradeButton;
    @FXML
    private Button backButton;

    @FXML
    public void initialize(){
        setupTableColumns();
    }

    //TODO: Implement method to setup table columns
    private void setupTableColumns(){

    }
}
