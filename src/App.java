public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        
        // add burgers to menu
        menu.addItem(new MenuItem("Cheeseburger", "Burgers", 9.99));
        menu.addItem(new MenuItem("BBQ Burger", "Burgers", 10.99));
        menu.addItem(new MenuItem("Mushroom Swiss Burger", "Burgers", 11.99));

        // add sandwhiches to menu
        menu.addItem(new MenuItem("Patty Melt", "Sandwhiches", 9.99));
        menu.addItem(new MenuItem("BLT", "Sandwhiches", 7.99));
        menu.addItem(new MenuItem("Pulled Pork Sandwhich", "Sandwhiches", 10.99));
 
        // add steaks to menu
        menu.addItem(new MenuItem("New York Strip", "Steak", 12.99));
        menu.addItem(new MenuItem("Ribeye", "Steak", 17.99));
        menu.addItem(new MenuItem("Filet Mignon", "Steak", 21.99));

        // add sodas to menu
        menu.addItem(new MenuItem("Dr. Pepper", "Soda", 1.99));
        menu.addItem(new MenuItem("Sprite", "Soda", 1.99));
        menu.addItem(new MenuItem("Root Beer", "Soda", 1.99));

        //add non-alcoholic drinks to menu
        menu.addItem(new MenuItem("Lemonade", "Non-Alcoholic", 1.99));
        menu.addItem(new MenuItem("Sweet Tea", "Non-Alcoholic", 1.99));
        menu.addItem(new MenuItem("Milkshake", "Non-alcoholic", 3.99));

        menu.displayMenu();

        OrderHandler orderHandler = new OrderHandler(menu.getItems());
        orderHandler.takeOrders();
    }
}
