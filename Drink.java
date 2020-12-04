public abstract class Drink implements Food{
    private float price;
    private int calories;
    protected boolean aCan;


    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    public boolean isaCan() {
        return this.aCan;
    }
}
