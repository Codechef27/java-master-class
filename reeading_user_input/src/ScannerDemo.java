import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();
        System.out.println("The number you entered was = " + number);

        System.out.println("Enter a word:");
        String word = sc.next();
        System.out.println("The Word you entered was = " + word);

        sc.close();
    }

}
