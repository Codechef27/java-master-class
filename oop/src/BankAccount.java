public class BankAccount {

    public static void main(String[] args) {

        BankAccount customer = new BankAccount();
        BankAccount timsAccount = new BankAccount("Tim", "tim@mail.com", "(863) -259 - 9522");

//         customer = new BankAccount("12345", 1100, "Brad Kennett",
//                "email@fakemail.com", "850 567 3015");

//        customer.setName("John Smith");
//        customer.setBalance(1000.00);
//        customer.setAccountNumber("123456789");
//        customer.setEmail("john@fakemail.com");
//        customer.setPhoneNumber("281-330-8004");

//        System.out.println("Name: " + customer.getName());
//        System.out.println("Balance: $" + customer.getBalance());
//        System.out.println("Account Number: " + customer.getAccountNumber());
//        System.out.println("Email: " + customer.getEmail());System.out.println("Phone: " + customer.getPhoneNumber());


        System.out.println(customer.getAccountNumber());
        System.out.println(customer.getBalance());
        customer.depositFunds(100.09);
        customer.withdrawFunds(40);
    }

    public BankAccount() {

        this("56789", 2.50, "Default name", "Default address" ,
                "default phone");
        System.out.println("Empty constructor called");
    }

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double balance, String name, String customerEmail, String phone) {
        System.out.println("parameterized constructor called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        email = customerEmail;
        phoneNumber = phone;
    }

    public BankAccount(String name, String email, String phoneNumber) {

        this("9999", 100.55, name, email, phoneNumber);
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        balance += deposit;
       System.out.println("You made a deposit of $" + deposit + ", your new balance is $" + this.balance);
    }

    public void withdrawFunds(double withdraw) {

        if (balance - withdraw > 0) {
             balance -= withdraw;
            System.out.println("You made a withdraw of $" +withdraw+ ", your new balance is $" + balance);
        } else if (balance - withdraw < 0) {System.out.println("you have insufficient funds available.");}


    }

    public String getAccountNumber() {
        return accountNumber;
  }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
