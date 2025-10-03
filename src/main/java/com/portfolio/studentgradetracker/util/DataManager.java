package com.portfolio.studentgradetracker.util;

import com.portfolio.studentgradetracker.model.Student;

import java.io.File;

public class DataManager {
    private static final String DATA_FILE_PATH = System.getProperty("User.home") + File.separator + ".grade_tracker" + File.separator + "student_data.ser";
    private static final String BACKUP_FILE_PATH = System.getProperty("User.home") + File.separator + ".grade_tracker" + File.separator + "student_backup.ser";

    //TODO: Create method to save student data to file
    public static void saveStudent(Student student) {
    }

    //TODO: Create method to load student data from file
    public static Student loadStudent() {
        return null;
    }

    //TODO: Create method to create backup of student data
    public static void createBackup(Student student) {
    }

    //TODO: Create method to check if data file exists
    public static boolean dataFileExists() {
        return false;
    }

    //TODO: Create method to export student data to text file
    public static void exportToTextFile(Student student, String filePath){

    }

    //TODO: Create method to delete data file
    public static void deleteDataFile(){

    }
}
