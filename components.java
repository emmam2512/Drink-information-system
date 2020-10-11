package sample;

public class components {

    private ingredients ingredient;
    private int quantity;

    public components() {
    }

    public components(ingredients ingredients, int quantity) {

        this.ingredient = ingredients;
        this.quantity = quantity;


    }


    public ingredients getIngredient() {
        return ingredient;
    }

    public void setIngredient(ingredients ingredient) {
        this.ingredient = ingredient;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "components:" +
                "ingredient='" + ingredient +
                ", quantity='" + quantity +
                '}';
    }
}
