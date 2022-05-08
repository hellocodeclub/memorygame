package com.hellocodeclub.memorygame;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AppController {

    @FXML
    public GridPane gameMatrix;

    Board board = new Board();

    @FXML
    public void initialize() throws FileNotFoundException {
        board.populateMatrix();

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                FileInputStream input = new FileInputStream(
                        "<PROJECT PATH HERE>/dev/java_projects/tutorials/memorygame/question.png");
                Image image = new Image(input);
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(90);
                imageView.setFitHeight(90);
                imageView.setUserData(row+","+col);
                imageView.setOnMouseClicked(event -> cardListener(event));
                gameMatrix.add(imageView, row, col);
            }
        }

    }

    public void cardListener(MouseEvent event){
        Node sourceComponent = (Node) event.getSource();
        String rowAndColum = (String)sourceComponent.getUserData();
        System.out.println(rowAndColum);
    }
}
