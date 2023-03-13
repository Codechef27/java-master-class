public class Furniture extends ProductForSale{


    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + "This piece was manufactured by hand in florida");
        System.out.printf("The price of this piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
