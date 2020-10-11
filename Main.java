package sample;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Main extends Application {

    public static Stage primaryStage;
    public static Parent root;
    public static GenericList<ingredients> ingredients = new GenericList<>();
    public static GenericList<Drink> drinks = new GenericList<>();


    public void start(Stage ps) throws Exception {
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.getStylesheets().add("sample/stylesheet.css");
        primaryStage = ps;
        primaryStage.setTitle(" Drink ");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        try {
          load();
       }
      catch (Exception e){
          System.out.println(e.toString());
       }

    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void loadChoicebox(ChoiceBox cb) {
        individualNode temp = ingredients.head;
        while (temp != null) {
            cb.getItems().add(temp.getContents());
            temp = temp.next;


        }
    }

    public static void loadChoicebox2(ChoiceBox cb) {
        individualNode temp = drinks.head;
        while (temp != null) {
            cb.getItems().add(temp.getContents());
            temp = temp.next;

        }
    }

    public static void loadList(ListView cb) {
        cb.getItems().clear();
        if(ingredients.getHead() == null)
            cb.getItems().add("");
        else{
            individualNode temp = ingredients.getHead();
            while(temp !=null){
                cb.getItems().add(temp.getContents());
                temp=temp.next;
            }
        }
    }

    public static void search(String name,ListView lv){
            lv.getItems().clear();
            selectionSort(ingredients);
            individualNode<ingredients> temp = ingredients.head;
            if(ingredients.head == null)
                lv.getItems().add("nothing here");
            while(temp != null){
                if(name.equals(temp.getContents().getIngredientName())){
                    lv.getItems().add(temp.getContents());
                }
                temp = temp.next;
            }
        }

        private static int findPosOfLargest(GenericList<ingredients> ingNames, int size){

        int largestPosSoFar = 0;
        for (int i = 1;i < size; i++)
        {
            if (ingNames.get(i).getIngredientName().compareTo(ingNames.get(largestPosSoFar).getIngredientName()) >0)
                largestPosSoFar = i;
        }
        return largestPosSoFar;
        }
        public static void selectionSort(GenericList<ingredients> ingNames){
        for (int i = ingNames.size(); i > 0; i--){
            int PosLargest = findPosOfLargest(ingNames, i);
            swap(ingNames, PosLargest, i-1);
        }
        }

    private static void swap(GenericList<sample.ingredients> gList, int pos, int swapPos) {
        gList.swapNodes(pos, swapPos);
    }


    public void load() throws Exception {
        XStream xstream = new XStream(new DomDriver());
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("ca2.xml"));
        drinks = (GenericList<Drink>) is.readObject();
        is.close();
        is = xstream.createObjectInputStream(new FileReader("ingred.xml"));
        ingredients = (GenericList<ingredients>) is.readObject();
        is.close();
    }

    public static void save() throws Exception {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("ca2.xml"));
        out.writeObject(drinks);
        out.close();
        out = xstream.createObjectOutputStream(new FileWriter("ingred.xml"));
        out.writeObject(ingredients);
        out.close();
    }

}



