public class Room {
    public String name = "Room";
    public String[] description = {"Description!", "More description!", "Yeow!"};
    public Item[] items;

    // actions
    public boolean look() {
        Util.printStringArray(description);
        return true;
    }
    
    public boolean look(String item) {
        try {
            Util.findItemByName(items, item).look();
            return true;
        } catch(Exception e) {
            System.out.print("I can't find " + item + ".");
            return false;
        }
    }
}