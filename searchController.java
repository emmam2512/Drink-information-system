package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


import java.io.IOException;

import static sample.Main.primaryStage;
import static sample.Main.root;

public class searchController {

    @FXML
    TextField searchBox;

    @FXML
    ListView ingreView;

    public void openMain(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            root.getStylesheets().add("sample/stylesheet.css");
            primaryStage.setTitle("search");
            primaryStage.setScene(new Scene(root));
        } catch (IOException el) {
        }
    }

    public void search(){
        Main.search(searchBox.getText(),ingreView);
    }
}
