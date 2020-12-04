public class AfternoonTea<T extends Drink, V extends Dessert> extends Menu{
    private Drink drink;
    private Dessert meal;

    public AfternoonTea(T drink, V dessert) {
        this.drink = drink;
        this.meal = dessert;
    }

    @Override
    public Drink getDrink() {
        return this.drink;
    }

    @Override
    public Dessert getMeal() {
        return this.meal;
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }
}
