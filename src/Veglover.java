public class Veglover implements PizzaStore {

    @Override
    public String itemName() {
        return "Veggie Pizza";
    }

    @Override
    public String getProductDescription() {
        return "\nComes with basil, olives and creamy dip.";
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public int getCalories() {
        return 320;
    }
}
