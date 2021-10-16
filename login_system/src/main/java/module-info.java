module org.openjfx.login_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;


    opens org.openjfx.login_system to javafx.fxml;
    exports org.openjfx.login_system;
    
}
