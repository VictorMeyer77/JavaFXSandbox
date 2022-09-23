module com.victormeyer.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.prefs;

    opens com.victormeyer.javafx to javafx.fxml;
    exports com.victormeyer.javafx;
    opens com.victormeyer.javafx.view to javafx.fxml;
    exports com.victormeyer.javafx.controller;
    opens com.victormeyer.javafx.controller to javafx.fxml;
}