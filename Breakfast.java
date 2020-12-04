public class Breakfast extends Menu {
    private Drink drink;
    private Bread meal;

    @Override
    public Drink getDrink() {
        return this.drink;
    }

    @Override
    public Bread getMeal() {
        return this.meal;
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }
}
