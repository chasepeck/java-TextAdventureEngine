final public class Util {
    // Item helpers
    public static Item findItemByName(Item[] items, String name) {
        for(int i = 0; i < items.length; i++)
            if(items[i].name.equals(name))  
                return items[i];
        return null;
    }
    
    // General helpers
    public static void printStringArray(String[] strings) {
        for(int i = 0; i < strings.length; i++)
            System.out.println(strings[i]);
    }
}
