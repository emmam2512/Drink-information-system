package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

import static sample.Main.*;

public class drinkController {
@FXML
    TextField drinkN,drinkO,image;
@FXML
TextArea drinkD;

    public void openMain(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            root.getStylesheets().add("sample/style.css");
            primaryStage.setTitle("Drink");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el){}
    }
    public void addDrinks(){
        Drink newDrink = new Drink(drinkN.getText(),drinkO.getText(),image.getText(),drinkD.getText());
        drinks.add(newDrink);

        System.out.println(drinks.head.getContents().toString());
        try {
            Main.save();
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }
}