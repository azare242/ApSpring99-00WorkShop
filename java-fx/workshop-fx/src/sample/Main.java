package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * A java Application for a simple calculator
 * @author Alireza Zare Zeynadabi
 * @version 2.0
 * @since 2021.june.16
 */
public class Main extends Application {

    /**
     * Start Method of application
     * @param primaryStage Stage of GUI
     */
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
            loader.setController(new Controller());
            Parent root = loader.load();
            primaryStage.setScene(new Scene(root,250,260));
            primaryStage.setTitle("Calculator");
            primaryStage.show();
        } catch (Exception e){
            System.err.println(e);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
