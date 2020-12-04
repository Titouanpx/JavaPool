public class Lunch extends Menu{
    private Drink drink;
    private Sandwich meal;

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
