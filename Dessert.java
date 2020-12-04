public abstract class Dessert implements Food{
    private float price;
    private int calories;


    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }
}
