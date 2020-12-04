import java.util.ArrayList;
import java.util.List;

public class CustomerOrder<T extends Food, V extends Food> {
    private Stock stock;
    private List<Object> order = new ArrayList<>();

    public CustomerOrder(Stock stock) {
        this.stock = stock;
    }

    public boolean addItem(Food food) throws NoSuchFoodException {
        if (this.stock.nbrItems.containsKey(food.getClass())) {
            if (this.stock.getNumberOf(food.getClass()) >= 1) {
                this.stock.remove(food.getClass());
                this.order.add(food);
                return true;
            } else {
                return false;
            }
        } else {
            throw new NoSuchFoodException("No such food type: " + food.getClass().getName() + ".");
        }
    }

    public boolean removeItem(Food food) throws NoSuchFoodException {
        if (this.stock.nbrItems.containsKey(food.getClass())) {
            if (this.order.contains(food)) {
                this.order.remove(food);
                this.stock.add(food.getClass());
                return true;
            } else {
                return false;
            }
        } else {
            throw new NoSuchFoodException("No such food type: " + food.getClass().getName() + ".");
        }
    }

    public float getPrice() {
        float priceOrder = 0;
        for (Object food: this.order) {
            if (food instanceof Food) {
                priceOrder += ((Food) food).getPrice();
            } else {
                priceOrder += ((Menu<?,?>) food).getPrice();
            }
        }
        return priceOrder;
    }

    public boolean addMenu(Menu<T,V> menu) throws NoSuchFoodException {
        if (this.stock.nbrItems.containsKey(menu.getDrink().getClass())) {
            if (this.stock.nbrItems.containsKey(menu.getMeal().getClass())) {
                if (this.stock.getNumberOf(menu.getMeal().getClass()) >= 1 && this.stock.getNumberOf(menu.getDrink().getClass()) >= 1) {
                    this.stock.remove(menu.getDrink().getClass());
                    this.stock.remove(menu.getMeal().getClass());
                    this.order.add(menu);
                    return true;
                } else {
                    return false;
                }
            } else {
                throw new NoSuchFoodException("No such food type: " + menu.getMeal().getClass().getName() + ".");
            }
        } else {
            throw new NoSuchFoodException("No such food type: " + menu.getDrink().getClass().getName() + ".");
        }
    }

    public boolean removeMenu(Menu<T,V> menu) throws NoSuchFoodException {
        if (this.stock.nbrItems.containsKey(menu.getDrink().getClass())) {
            if (this.stock.nbrItems.containsKey(menu.getMeal().getClass())) {
                if (this.order.contains(menu)) {
                    this.order.remove(menu);
                    this.stock.add(menu.getDrink().getClass());
                    this.stock.add(menu.getMeal().getClass());
                    return true;
                } else {
                    return false;
                }
            } else {
                throw new NoSuchFoodException("No such food type: " + menu.getMeal().getClass().getName() + ".");
            }
        } else {
            throw new NoSuchFoodException("No such food type: " + menu.getDrink().getClass().getName() + ".");
        }
    }

    public void printOrder() {
        StringBuilder orderPrint = new StringBuilder("Your order is composed of:\n");
        for (Object food : this.order) {
            if (food instanceof Menu) {
                orderPrint.append("- ").append(((Menu<?, ?>) food).getClass().getName()).append(" menu (").append(((Menu<?, ?>) food).getPrice()).append(" euros)\n");
                orderPrint.append("-> drink: ").append(((Menu<?, ?>) food).getDrink().getClass().getName()).append("\n");
                orderPrint.append("-> meal: ").append(((Menu<?, ?>) food).getMeal().getClass().getName()).append("\n");
            }
        }

        for (Object food : this.order) {
            if (!(food instanceof Menu)) {
                orderPrint.append("- ").append(food.getClass().getName()).append(" (").append(((Food) food).getPrice()).append(" euros)\n");
            }
        }

        orderPrint.append("For a total of ").append(this.getPrice()).append(" euros.");
        System.out.println(orderPrint);
    }
}
