package casellesrodriguez.jannay.pruebajavafxx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class QuestionsController {
    @FXML
    Button btn_anadir;
    @FXML
    Button btn_eliminar;
    @FXML
    Button btn_categories;
    @FXML
    Button btn_tornar;

    @FXML
    public void goToCategories() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("categories-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = new Stage();
        scene.getStylesheets().addAll(this.getClass().getResource("css/style.css").toExternalForm());
        stage.setTitle("Hola soc Mister Question");
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage) this.btn_categories.getScene().getWindow();
        myStage.close();

    }


    @FXML
    public void addQuestion () throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("question-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = new Stage();
        scene.getStylesheets().addAll(this.getClass().getResource("css/style.css").toExternalForm());
        stage.setTitle("Hola soc Mister Question");
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage) this.btn_anadir.getScene().getWindow();
        myStage.close();
    }
    @FXML
    public void deleteQuestion() {

    }
    @FXML
    public void r_return() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = new Stage();
        scene.getStylesheets().addAll(this.getClass().getResource("css/style.css").toExternalForm());
        stage.setTitle("Hola soc Mister Question");
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage) this.btn_tornar.getScene().getWindow();
        myStage.close();
    }
 }
