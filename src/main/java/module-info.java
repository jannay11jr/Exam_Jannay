module casellesrodriguez.jannay.pruebajavafxx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens casellesrodriguez.jannay.pruebajavafxx to javafx.fxml;
    exports casellesrodriguez.jannay.pruebajavafxx;
}