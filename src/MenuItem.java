import java.util.Objects;

public class MenuItem {
    private String itemName;
    private String category;
    private double price;
    private int itemNumber = 0; // specific object's number
    private static int nextItemNumber = 1; // tracker of what number the entire menu is on

    public MenuItem(){}

    public MenuItem(String itemName, String category, double price) {
        this.itemName = itemName;
        this.category = category;
        this.price = price;
        this.itemNumber = nextItemNumber;
        nextItemNumber++;
    }

    // getters and setters
    public String getItemName() {return itemName;}

    public double getPrice() {return price;}

    public void updatePrice(double price){
        this.price = price;
    }

    public String getCategory() {return category;}

    public int getItemNumber() {return itemNumber;}

    
    // checks for MenuItem objects with the same itemName field rather than reference equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MenuItem other = (MenuItem) obj;
        return Objects.equals(this.itemName, other.itemName);
    }

    // ensures MenuItem objects with same itemName generate same hash code
    @Override
    public int hashCode(){
        return Objects.hash(this.itemName);
    }

    
}
