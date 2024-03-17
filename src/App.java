public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        
        // add burgers to menu
        MenuItem cheeseburger = new MenuItem("Cheeseburger", "Burgers", 9.99);
        menu.addItem(cheeseburger);
        MenuItem bbqBurger = new MenuItem("BBQ Burger", "Burgers", 11.99);
        menu.addItem(bbqBurger);
        MenuItem msBurger = new MenuItem("Mushroom Swiss Burger", "Burgers", 11.99);
        menu.addItem(msBurger);

        // add sandwhiches to menu
        MenuItem pattyMelt = new MenuItem("Patty Melt", "Sandwhiches", 10.99);
        menu.addItem(pattyMelt);
        MenuItem blt = new MenuItem("BLT", "Sandwhiches", 8.99);
        menu.addItem(blt);
        MenuItem pulledPork = new MenuItem("Pulled Pork Sandwhich", "Sandwhiches", 10.99);
        menu.addItem(pulledPork);

        // add steaks to menu
        MenuItem nyStrip = new MenuItem("New York Strip", "Steak", 14.99);
        menu.addItem(nyStrip);
        MenuItem ribeye = new MenuItem("Ribeye", "Steak", 17.99);
        menu.addItem(ribeye);
        MenuItem filet = new MenuItem("Filet Mignon", "Steak", 21.99);
        menu.addItem(filet);

        // add sodas to menu
        MenuItem drPepper = new MenuItem("Dr. Pepper", "Soda", 1.99);
        menu.addItem(drPepper);
        MenuItem sprite = new MenuItem("Sprite", "Soda", 1.99);
        menu.addItem(sprite);
        MenuItem rootBeer = new MenuItem("Root Beer", "Soda", 1.99);
        menu.addItem(rootBeer);

        // add non-alcoholic drinks to menu
        MenuItem lemonade = new MenuItem("Lemonade", "Non-Alcoholic", 2.99);
        menu.addItem(lemonade);
        MenuItem sweetTea = new MenuItem("Sweet Tea", "Non-Alcoholic", 2.99);
        menu.addItem(sweetTea);
        MenuItem milkshake = new MenuItem("Milkshake", "Non-Alcoholic", 4.99);
        menu.addItem(milkshake);

        milkshake.updatePrice(10.00);

        menu.displayMenu();

        OrderHandler orderHandler = new OrderHandler(menu.getItems());
        orderHandler.takeOrders();
    }
}
