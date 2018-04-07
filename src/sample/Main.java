package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(20);
//        root.setHgap(20);
        primaryStage.setTitle("My First Ever Application in JavaFX");
        primaryStage.setScene(new Scene(root, 500, 275));

//        Label greeting = new Label("Welcome to JavaFX");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Arial", FontWeight.BOLD, 40));
//        root.getChildren().add(greeting);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
