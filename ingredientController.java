package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

import static sample.Main.*;


public class ingredientController {
@FXML
TextField iName;
@FXML
    Slider alcoContent;
@FXML
TextArea iDescription;

    public void openMain(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            root.getStylesheets().add("sample/stylesheet.css");
            primaryStage.setTitle("Ingredients");
            primaryStage.setScene(new Scene(root));
        }
        catch (IOException el){}
    }

    public void addIngredients(){
        ingredients newIngredients = new  ingredients(iName.getText(),iDescription.getText(),(int)alcoContent.getValue());
        ingredients.add(newIngredients);
        System.out.println(ingredients.head.getContents().toString());
        try{
            Main.save();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
    }


