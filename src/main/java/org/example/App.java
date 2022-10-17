package org.example;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.algorithms.BubbleSort;
import org.example.algorithms.SortAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class App extends Application {

    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 65;

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage){
        BorderPane root = new BorderPane();
        final Button exitButton = new Button("exit");
        exitButton.setOnAction(e -> System.exit(0));

        Button quickSortButton = new Button("Quick Sort");
        Button bubbleSortButton = new Button("Bubble Sort");

        TextField input = new TextField("Enter integer");
        ArrayList<Integer> arrayList = new ArrayList<>();
        Button addButton = new Button("Add");
        Label label = new Label();
        Label label2 = new Label();
        HBox top = new HBox();
        VBox output = new VBox();
        output.getChildren().addAll(label, label2);
        top.getChildren().addAll(input,addButton,quickSortButton,bubbleSortButton);

        root.setTop(top);
        root.setCenter(output);

        addButton.setOnAction(e -> {
            try {
                arrayList.add(Integer.parseInt(input.getText()));
                label.setText(arrayList.toString());
            }
            catch (Exception ex) {
                label.setText("not an integer!");

            }
        });

        quickSortButton.setOnAction(e -> Platform.runLater(() -> {

            //sortAlgorithm sort = new quickSort();

            //try {
            Collections.sort(arrayList);
            //arrayList.sort();
            label2.setText(arrayList.toString());
            //  } catch (InterruptedException ex) {
            //  throw new RuntimeException(ex);
            // }
        }));

        bubbleSortButton.setOnAction(e -> Platform.runLater(() -> {

            SortAlgorithm sort = new BubbleSort();
            //System.out.println(arrayList);
            try {
                sort.sort(arrayList);
                label2.setText(arrayList.toString());
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }));


        stage.setScene(new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT));
        stage.setMinHeight(WINDOW_HEIGHT);
        stage.setMinWidth(WINDOW_WIDTH);
        stage.show();
    }


}