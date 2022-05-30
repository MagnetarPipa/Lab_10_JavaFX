module com.company.lab_10_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.company.lab_10_javafx to javafx.fxml;
    exports com.company.lab_10_javafx;
}