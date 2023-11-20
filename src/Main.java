import java.util.Scanner;
public class Main {
    static int cheese=0;
    static int meat=0;
    static int veg=0;
    static int total=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pizzas would you like to order?");
        PizzaStore[] pizza = new PizzaStore[sc.nextInt()];
        int choice = 0;

        for (int i = 0; i < pizza.length && choice != 4; i++) {
            System.out.println("\nChoose your Pizza:\n1. Cheese Pizza\n2. Meat Lover's Pizza\n3. Veggie Pizza\n4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pizza[i] = new Cheeselover();
                    cheese++;
                    break;
                case 2:
                    pizza[i] = new Meatlover();
                    meat++;
                    break;
                case 3:
                    pizza[i] = new Veglover();
                    veg++;
                    break;
                case 4:
                    pizza[i] = null;
                    System.out.println("\nExiting");
                    break;
                default:
                    System.err.println("\nEnter correct input, try again.");
                    break;
            }
            if(pizza[i] != null){
                System.out.println(pizza[i].getProductDescription() + "\n Price:  $" + pizza[i].getPrice() + "\n Calories: " + pizza[i].getCalories() + "\n");
            }
        }
        displayTotal();
    }
    //display the order and total with tax after user is done ordering
    public static void displayTotal(){
        System.out.print("\nYou ordered ");
        if(cheese>0){
            System.out.printf(cheese + " Cheese pizza, ");
        }
        if(veg>0){
            System.out.printf(veg + " Veggie pizza, ");
        }
        if(meat>0){
            System.out.printf(meat + " Meat-lover pizza ");
        }
        if((total = (veg*20) + (meat*30) + (cheese*15))>0){
            System.out.println("\nTotal after tax: $" + (total+total*.13) + "\n***");
        }else
            System.out.println("nothing.\n***");
        }
}
