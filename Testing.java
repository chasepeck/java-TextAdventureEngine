public class Testing {
    public static void main(String[] args) {        
        Foyer testRoom = new Foyer();
        testRoom.look();
        testRoom.look("Item");
        testRoom.look("Nonexistent item");
    }
}

class Foyer extends Room {
    public Foyer() {
        items = new Item[]{ new Item() };
    }
}