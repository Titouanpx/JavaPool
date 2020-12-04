import java.util.ArrayList;
import java.util.List;

public abstract class Sandwich implements Food{
    private float price;
    private int calories;
    private boolean vegetation;
    private List<String> ingredients = new ArrayList<>();


    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    public boolean isVegetation() {
        return this.vegetation;
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }
}
