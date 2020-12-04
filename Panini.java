import java.util.ArrayList;
import java.util.List;

public class Panini extends Sandwich{

    @Override
    public float getPrice() {
        return (float) 3.50;
    }

    @Override
    public int getCalories() {
        return 120;
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }

    @Override
    public List<String> getIngredients() {
        List<String> lst = new ArrayList<>();
        lst.add("tomato");
        lst.add("salad");
        lst.add("cucumber");
        lst.add("avocado");
        lst.add("cheese");
        return lst;
    }
}
