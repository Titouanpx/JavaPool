public class Coke extends Drink{

    @Override
    public float getPrice() {
        return (float) 1.20;
    }

    @Override
    public int getCalories() {
        return 105;
    }

    @Override
    public boolean isaCan() {
        return true;
    }
}
