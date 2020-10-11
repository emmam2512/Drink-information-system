package sample;



public class Drink {
    private String drinkName;
    private String origin;
    private String description;
    private String image;
    private GenericList<components> components = new GenericList<>();


    public Drink(String drinkName ,String origin ,String description,String image) {
        this.drinkName = drinkName;
        this.origin = origin;
        this.description = description;
        this.image = image;


    }


    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public GenericList<sample.components> getComponents() { return components; }

    public void setComponents(GenericList<sample.components> components) { this.components = components; }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return drinkName;
    }

    public void setComponents() {

    }
}