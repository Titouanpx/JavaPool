import java.util.ArrayList;
import java.util.List;

public class HamSandwich extends Sandwich{

    @Override
    public float getPrice() {
        return (float) 4.00;
    }

    @Override
    public int getCalories() {
        return 230;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public List<String> getIngredients() {
        List<String> lst = new ArrayList<>();
        lst.add("tomato");
        lst.add("salad");
        lst.add("cheese");
        lst.add("ham");
        lst.add("butter");
        return lst;
    }
}
