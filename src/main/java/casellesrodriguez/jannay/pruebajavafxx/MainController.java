package casellesrodriguez.jannay.pruebajavafxx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController extends Application {

    @FXML
    Button btn_preguntas;
    @FXML
    Button btn_jugar;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        scene.getStylesheets().addAll(this.getClass().getResource("css/style.css").toExternalForm());
        stage.setTitle("Hola soc Mister Question");
        stage.setScene(scene);
        stage.show();
        DDBB d = new DDBB();
        d.conectar();
    }

    @FXML
    public void goToQuestions(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("questions-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = new Stage();
        scene.getStylesheets().addAll(this.getClass().getResource("css/style.css").toExternalForm());
        stage.setTitle("Hola soc Mister Question");
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage) this.btn_preguntas.getScene().getWindow();
        myStage.close();
    }
    @FXML
    public void goToPlay(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("players-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = new Stage();
        scene.getStylesheets().addAll(this.getClass().getResource("css/style.css").toExternalForm());
        stage.setTitle("Hola soc Mister Question");
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage) this.btn_jugar.getScene().getWindow();
        myStage.close();

    }


    public static void main(String[] args) {
        launch();
    }
}
