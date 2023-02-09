import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        System.out.println(getSum());
    }

    public static String getSum() {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int counter = 1;

        do {
            System.out.println("Enter #" + counter + ":");
            String nextNum = scan.nextLine();
            try {
                double number = Double.parseDouble(nextNum);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        } while(counter <= 5 );

        return " the sum of the 5 numbers = " + sum;
    }
}
