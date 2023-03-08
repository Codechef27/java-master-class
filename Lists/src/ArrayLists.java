import java.util.Arrays;
import java.util.ArrayList;
public class ArrayLists {

    record GroceryItem(String name, String type, int count) {
        public GroceryItem(String name) {
            this(name, "DAIRY", 1);
        }

        public String toString() {
            return String.format("%d %s in %s", count, name.toUpperCase(), type );
        }
    }
    public static void main(String[] args) {

        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6 );
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);

        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter"));
        objectList.add("yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("butter"));
       // groceryList.add("yogurt");
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 6));
        groceryList.set( 0, new GroceryItem("apples", "PRODUCE", 10));

        groceryList.remove(1);


        System.out.println(groceryList);

    }
}
