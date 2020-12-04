public abstract class Menu<T extends Food, V extends Food> {
    private T drink;
    private V meal;

    public T getDrink() {
        return this.drink;
    }

    public V getMeal() {
        return this.meal;
    }

    public float getPrice() {
        float price = (float) ((this.getDrink().getPrice() + this.getMeal().getPrice()) * 0.90);
        return price;
    }
}
