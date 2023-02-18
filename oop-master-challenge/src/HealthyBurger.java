public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger(){
        double totalPrice = super.itemizeHamburger();
        System.out.println("Brown hamburger on a Brown rye roll with meat, price is " + totalPrice);
        if(healthyExtra1Name != null){
            totalPrice += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for a price of " + healthyExtra1Price);
        }
        if(healthyExtra2Name != null){
            totalPrice += healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for a price of " + healthyExtra2Price);
        }
        return totalPrice;
    }
}
