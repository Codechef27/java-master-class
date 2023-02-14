public class Customer {

    public static void main(String[] args) {

        Customer newCustomer = new Customer("Tim", 1000.00, "tim@mail.com");

        System.out.println(newCustomer.getName());
        System.out.println(newCustomer.getCreditLimit());
        System.out.println(newCustomer.getEmail());

        Customer customer2 = new Customer();

        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        Customer customer3 = new Customer("Bradley Kennett", "brad@mail.com");

        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());



    }

    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("Default name", "Default email");

    }

    public Customer(String name, String email) {
        this(name, 2500.00, email );

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
