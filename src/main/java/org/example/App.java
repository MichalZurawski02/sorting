package org.example;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class App extends Application {

    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 720;

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage){
        BorderPane root = new BorderPane();
        Button exitButton = new Button("exit");
        exitButton.setOnAction(e -> System.exit(0));

        Button quickSortButton = new Button("Quick Sort");
        Button bubbleSortButton = new Button("Bubble Sort");
        ArrayList<Button> sortButtons = new ArrayList<>();
        sortButtons.add(quickSortButton);
        sortButtons.add(bubbleSortButton);
        ComboBox<Button> algo = new ComboBox<>(FXCollections.observableArrayList(sortButtons));
        algo.setPromptText("Choose sorting algorithm");

        TextField input = new TextField("Enter integer");

        Button addButton = new Button("Add");


        HBox top = new HBox();
        top.getChildren().addAll(input,addButton ,algo);

        root.setTop(top);

        stage.setScene(new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT));
        stage.setMinHeight(WINDOW_HEIGHT);
        stage.setMinWidth(WINDOW_WIDTH);
        stage.show();
    }


}