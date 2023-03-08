import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            userChoice();
            switch(Integer.parseInt(scan.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
        userChoice();
    }

    private static Scanner scan = new Scanner(System.in);

    private static void userChoice() {

        String choices = """
                Available actions:
                
                0 - to exit
                
                1 - to add item(s) to list
                
                2 - to remove any item(s)
                
                Enter a number for what you want to do:""";
        System.out.println(choices + " ");
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [Separate items by comma]:");
        String[] items = scan.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }


        }
    }


    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [Separate items by comma]:");
        String[] items = scan.nextLine().split(",");


        for (String i : items) {
            String trimmed = i.trim();
                groceries.remove(trimmed);

        }
    }


}
