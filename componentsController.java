package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;

import java.io.IOException;
import java.util.LinkedList;

import static sample.Main.*;

public class componentsController {

    @FXML
    ChoiceBox ingredientBox;
    @FXML
    ChoiceBox drinkBox;
    @FXML
    Slider quantity;
    @FXML
    ListView ListIngrediant;

    private static GenericList<components> components = new GenericList<>();

    public void openMain(ActionEvent actionEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            root.getStylesheets().add("sample/stylesheet.css");
            primaryStage.setTitle("Ingredients");
            primaryStage.setScene(new Scene(root));
        } catch (IOException el) {
        }
    }

    public void initialize() {
        Main.loadChoicebox(ingredientBox);
        Main.loadChoicebox2(drinkBox);
    }

    public void addComponents() {
        components newComponent = new components((sample.ingredients) ingredientBox.getSelectionModel().getSelectedItem(),(int) quantity.getValue());
        components.add(newComponent);
        Main.loadList(ListIngrediant);
        System.out.println(ingredients.head.getContents().toString());
    }

    public void addToDrink(){
        Drink theDrink = (Drink) drinkBox.getSelectionModel().getSelectedItem();
        theDrink.setComponents(components);
      try{
         Main.save();
    }
       catch (Exception e){
          System.out.println(e.toString());
     }
    }
}