package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * A java Application for a simple calculator
 * @author Alireza Zare Zeynadabi
 * @version 1.0
 * @since 2021.june.12
 */
public class Main extends Application {

    /**
     * Start Method of application
     * @param primaryStage Stage of GUI
     * @throws Exception exceptions
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 275, 325));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
