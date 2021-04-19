package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    private double x;
    private double y;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Find String");
//        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Scene s = new Scene(root);
//        s.setOnMousePressed(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                x = primaryStage.getX() - event.getScreenX();
//                y = primaryStage.getY() - event.getScreenY();
//            }
//        });
//        s.setOnMouseDragged(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                primaryStage.setX(event.getScreenX() + x);
//                primaryStage.setY(event.getScreenY() + y);
//            }
//        });
//        s.setFill(Color.TRANSPARENT);
        primaryStage.setScene(s);
        primaryStage.show();
//        Добавили текст
        //        Добавили текст
        //        Добавили текст
        //        Добавили текст
        //        Добавили текст
        //        Добавили текст//        Добавили текст
        //        Добавили текст

        //        Добавили текст
        //        Добавили текст
        //        Добавили текст
        //        Добавили текст
        //        Добавили текст//        Добавили текст
        //        Добавили текст


    }

    public static void main(String[] args) {

        launch(args);

    }
}
