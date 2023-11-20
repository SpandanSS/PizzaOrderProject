public class Meatlover implements PizzaStore {

    @Override
    public String itemName() {
        return "Meat Lover's Pizza";
    }

    @Override
    public String getProductDescription() {
        return "\nComes with pepperoni, beef and bacon.";
    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public int getCalories() {
        return 420;
    }
}
