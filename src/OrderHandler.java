import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class OrderHandler {
    private Set<MenuItem> menuItems;

    public OrderHandler(Set<MenuItem> items) {
        menuItems = new LinkedHashSet<>(items);
    }

    public void takeOrders() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Please enter the numbers corresponding to the items you want to order (separated by spaces):");
            String[] orderItems = scanner.nextLine().split(" ");
            double total = 0.0;

            // Calculate total price for the order
            for (String itemNumber : orderItems) {
                try {
                    int number = Integer.parseInt(itemNumber);
                    MenuItem item = findItemByNumber(number);
                    if (item != null) {
                        total += item.getPrice();
                        System.out.println();
                        System.out.println("Total price for your order: $" + total);
                        System.out.println("Your order number is: " + generateOrderNumber());
                        System.out.println();
                    } else {
                        System.out.println("Invalid item number: " + number);
                        System.out.println();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input: " + itemNumber);
                }
            }

            // Prompt for another order
            System.out.println("Would you like to place another order?");
            choice = scanner.nextLine().toLowerCase();
        } while (!choice.equals("no" ) && !choice.equals("n"));

        // Close the scanner after taking orders
        scanner.close();

        System.out.println();
        System.out.println("Thank you for your order. See you next time");
        System.out.println();
    }

    private MenuItem findItemByNumber(int number) {
        for (MenuItem item : menuItems){
            if (item.getItemNumber() == number) 
                return item;
        }
        return null;
    }

    private int generateOrderNumber() {
        return (int) (Math.random() * 1000);
    }
}