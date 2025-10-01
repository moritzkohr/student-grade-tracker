module com.portfolio.studentgradetracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.portfolio.studentgradetracker to javafx.fxml;
    exports com.portfolio.studentgradetracker;
}