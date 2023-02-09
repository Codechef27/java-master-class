import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int loops = 0;

        boolean charEntered = false;

        do {
            System.out.println("Enter a number or any character to quit!");
            try {
                String input = scan.nextLine();
                int userEntry = Integer.parseInt(input);
                if ( loops == 0 || userEntry < min) {
                min = userEntry;
                }
                if (userEntry > max) {
                    max = userEntry;
                }
                loops++;
                System.out.println("The minimum number you entered is: " + min +
                        " The maximum number you entered is: " + max);
            } catch (NumberFormatException e) {
                System.out.println("You have quit!");
                charEntered = true;
            }
        } while(!charEntered);


    }
}
