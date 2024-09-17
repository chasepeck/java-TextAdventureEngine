public class Item {
    public String name = "Item";
    public String[] description = {"Description!", "More description!", "Yeow!"};
    
    // actions
    public boolean look() {
        System.out.println("I can't look at that.");
        return false;
    }
}