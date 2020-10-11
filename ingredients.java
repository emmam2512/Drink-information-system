package sample;

public class ingredients {
    private String ingredientName;
    private String ingredientDescription;
    private int alcoholContent;



    public ingredients(String ingredientName, String ingredientDescription, int alcoholContent) {
        this.ingredientName = ingredientName;
        this.ingredientDescription = ingredientDescription;
        this.alcoholContent = alcoholContent;


    }

    public ingredients() {

    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientDescription() {
        return ingredientDescription;
    }

    public void setIngredientDescription(String ingredientDescription) { this.ingredientDescription = ingredientDescription; }

    public int getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(int alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    @Override
    public String toString() {
        return
                ingredientName;
    }
}