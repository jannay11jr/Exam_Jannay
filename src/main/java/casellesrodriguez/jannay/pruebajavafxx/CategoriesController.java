package casellesrodriguez.jannay.pruebajavafxx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CategoriesController {
    @FXML
    Button btn_tornar;

    public String save() {
        return"";
    }
    @FXML
    public void r_return () throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("questions-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = new Stage();
        scene.getStylesheets().addAll(this.getClass().getResource("css/style.css").toExternalForm());
        stage.setTitle("Hola soc Mister Question");
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage) this.btn_tornar.getScene().getWindow();
        myStage.close();

    }
    public void delete () {

    }
}
