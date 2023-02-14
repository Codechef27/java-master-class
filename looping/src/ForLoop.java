public class ForLoop {

    public static void main(String[] args) {
        for (int counter = 1; counter <=5; counter++) {
            System.out.println(counter);
        }

        for (double rate =2.0; rate <= 5; rate++) {
            double interestAmmount = calculateInterest(10000, rate);
            System.out.println("10000 at " + rate + "% interest = "  + interestAmmount);
      }


        for (double rates =7.5; rates <= 10; rates+= .25 ) {
            double interestAmount = calculateInterest(100, rates);
            System.out.println("$100 at " + rates + "% interest = $"  + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
