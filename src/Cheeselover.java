public class Cheeselover implements PizzaStore {
    @Override
    public String itemName() {
        return "Cheese Pizza";
    }

    @Override
    public String getProductDescription() {
        return "\nComes with three-cheese blend topping.";
    }

    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public int getCalories() {
        return 380;
    }

}
