package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/sample.fxml"));
        //Parent root1 = FXMLLoader.load(getClass().getResource("trangchu.fxml"));
        primaryStage.setTitle("LOGIN");
        primaryStage.setScene(new Scene(root, 1920, 1000));
        //primaryStage.setScene(new Scene(root1, 1920, 1000));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
