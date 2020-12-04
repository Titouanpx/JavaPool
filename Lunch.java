public class Lunch<T extends Drink, V extends Sandwich> extends Menu{
    private Drink drink;
    private Sandwich meal;

    public Lunch(T drink, V sandwich) {
        this.drink = drink;
        this.meal = sandwich;
    }

    @Override
    public Drink getDrink() {
        return this.drink;
    }

    @Override
    public Sandwich getMeal() {
        return this.meal;
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }
}
