public class AfternoonTea extends Menu{
    private Drink drink;
    private Dessert meal;

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
