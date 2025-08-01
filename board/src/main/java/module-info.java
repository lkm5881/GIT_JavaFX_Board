module com.lkm {
    requires javafx.base;
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;

    opens com.lkm to javafx.base, javafx.graphics, javafx.fxml;
    opens com.lkm.Controller to javafx.fxml;
    opens com.lkm.DTO to javafx.base;

    exports com.lkm;
}
