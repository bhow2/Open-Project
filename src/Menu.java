import java.util.Set;
import java.util.LinkedHashSet;


public class Menu{
    Set<MenuItem> menuSet;

    public Menu() {
        // using a linked hash set to maintain insertion order and prevent duplicates
        menuSet = new LinkedHashSet<>();
    }

    public void addItem(MenuItem item){
        menuSet.add(item);
    }
    
    public Set<MenuItem> getItems(){
        return menuSet;
    }

    public void displayMenu() {
        for (String category : getCategorySet(menuSet)){
            displayCategory(menuSet, category);
        }
    }

    private void displayCategory(Set<MenuItem> mSet, String category) {
        // displays category name
        System.out.println("---- " + category + " ----");

        System.out.println();

        // displays specific category items with itemNumber next to it
        for (MenuItem items : mSet) {
            if (items.getCategory().equalsIgnoreCase(category)) {
                System.out.println(items.getItemNumber() + ". " + items.getItemName() + " - $" + items.getPrice());
            }
        }
        System.out.println();
    }

    // 
    private Set<String> getCategorySet(Set<MenuItem> mSet){
        Set<String> categorySet = new LinkedHashSet<>();
        
        for(MenuItem item : mSet){
            categorySet.add(item.getCategory());
        }
        return categorySet;
    }
    
}