public class Breakfast<T extends Drink, V extends Bread> extends Menu {
    private Drink drink;
    private Bread meal;

    public Breakfast(T drink, V bread) {
       this.drink = drink;
       this.meal = bread;
    }


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
