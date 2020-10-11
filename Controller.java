package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

import static sample.Main.primaryStage;
import static sample.Main.root;

public class Controller {



    public void openDrink(javafx.event.ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/drinks.fxml"));
            root.getStylesheets().add("sample/stylesheet.css");

            primaryStage.setTitle("Drink");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el){}
    }


    public void openIngredients(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("ingredients.fxml"));
            root.getStylesheets().add("sample/stylesheet.css");
            primaryStage.setTitle("Drink");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el){}
    }


    public void openComponents(javafx.event.ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/components.fxml"));
            root.getStylesheets().add("sample/stylesheet.css");
            primaryStage.setTitle("Drink");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el) {}
    }


    public void openSearch (javafx.event.ActionEvent actionEvent){
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/search.fxml"));
            root.getStylesheets().add("sample/stylesheet.css");
            primaryStage.setTitle("Drink");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el) {}
    }

}
