import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product){}

public class Store {

   private static ArrayList<ProductForSale> products = new ArrayList<>();
    public static void main(String[] args) {

        products.add(new ArtObject("Oil Painting", 1300, "Impressionistic work by Bob Ross " +
                "in 2001."));
        products.add(new ArtObject("Sculpture", 2000000000,
                "Ancient Roman Sculpture by JKF, depicting Julius Caesar, Produced in the year 812"));
        products.add(new Furniture("Samsung TV", 1500, "A 99 inch smart tv, hi-def 90" +
                "fps with six hdmi ports and wireless capabilities"));
        products.add(new Furniture("Mahogany Art Table", 2000, "A hand crafted art table " +
                "with tons of storage"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);

        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 2);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);

        printOrder(order2);

    }

    public static void listProducts() {

        for (var item : products) {

            System.out.println("-".repeat(30));
            item.showDetails();

        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {

        order.add(new OrderItem(quantity, products.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());

        }
        System.out.printf("Sales total = $%6.2f %n", salesTotal);
    }
}
