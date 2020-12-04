import java.util.ArrayList;
import java.util.List;

public abstract class Sandwich implements Food{
    private float price;
    private int calories;
    protected boolean vegetarian;
    protected List<String> ingredients = new ArrayList<>();


    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    public boolean isVegetarian() {
        return this.vegetarian;
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }
}
