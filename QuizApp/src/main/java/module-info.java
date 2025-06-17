module com.ptmgaa.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ptmgaa.quizapp to javafx.fxml;
    exports com.ptmgaa.quizapp;
}
