public class BankAccount {

    int accountId;
    String accountHolder;
    double accountValue;

    void printInfo() {
        System.out.println("Account holders name: " + accountHolder);
        System.out.println("Account balance: " + "$" + accountValue);
    }

    public int getAccountId() {
        System.out.println("Retrieving account id");
        return accountId;
    }

    public void setAccountId(int idInput) {
        accountId = idInput;
    }
}
