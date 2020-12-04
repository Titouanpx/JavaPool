import java.util.HashMap;
import java.util.Map;

public class Stock {
    protected Map<Class<? extends Food>, Integer> nbrItems = new HashMap<>();

//    public Stock(Map<Class<? extends Food>, Integer> nbrItems) {
//        nbrItems.replaceAll((k,v)->v=100);
//        this.nbrItems = nbrItems;
//    }

    public Stock() {
        FrenchBaguette frBaguette = new FrenchBaguette();
        nbrItems.put(frBaguette.getClass(), 100);
        SoftBread softBread = new SoftBread();
        nbrItems.put(softBread.getClass(), 100);

        AppleSmoothie appleSmoothie = new AppleSmoothie();
        nbrItems.put(appleSmoothie.getClass(), 100);
        Coke coke = new Coke();
        nbrItems.put(coke.getClass(), 100);

        HamSandwich hamSandwich = new HamSandwich();
        nbrItems.put(hamSandwich.getClass(), 100);
        Panini panini = new Panini();
        nbrItems.put(panini.getClass(), 100);

        Cookie cookie = new Cookie();
        nbrItems.put(cookie.getClass(), 100);
        CheeseCake cheeseCake = new CheeseCake();
        nbrItems.put(cheeseCake.getClass(), 100);
    }

    public int getNumberOf(Class<? extends Food> item) {
        return this.nbrItems.get(item);
    }

    public boolean add(Class<? extends Food> item) throws NoSuchFoodException {
        if (this.nbrItems.containsKey(item)) {
            this.nbrItems.put(item, this.nbrItems.get(item) + 1);
            return true;
        } else {
            throw new NoSuchFoodException("No such food type: " + item + ".");
        }
    }

    public boolean remove(Class<? extends Food> item) throws NoSuchFoodException {
        if (this.nbrItems.containsKey(item)) {
            if (getNumberOf(item) >= 1) {
                this.nbrItems.put(item, this.nbrItems.get(item) + 1);
                return true;
            } else return false;
        } else {
            throw new NoSuchFoodException("No such food type: " + item + ".");
        }
    }
}
