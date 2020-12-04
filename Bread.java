public abstract class Bread implements Food{
    private float price;
    private int calories;
    protected int bakingTime;

    public Bread(float price, int calories) {
        this.price = price;
        this.calories = calories;
        this.bakingTime=0;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    public int getBakingTime() {
        return this.bakingTime;
    }
}
