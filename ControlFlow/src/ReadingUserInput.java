import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        int currentYear = 2023;
        try {
            System.out.println(getConsoleYear(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getScannerYear(currentYear));
        }
        
    }

    public static String getConsoleYear(int currentYear) {

        String name = System.console().readLine("Hi what is your name?");
        System.out.println(" hi " +name+ ", your welcome!");
        String dob = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dob);
        return "So you are " +age+ " years old!";
    }

    public static String getScannerYear(int currentYear){

        Scanner scan = new Scanner(System.in);

        System.out.println("Hi what is your name?");
        String name = scan.nextLine();
        System.out.println(" hi " +name+ ", your welcome!");

        System.out.println("What year were you born?");
        boolean validDob = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
            age = checkData(currentYear, scan.nextLine());
            validDob = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed!!! try again.");
            }

        } while (!validDob);
        return "So you are " +age+ " years old!";
    }

    public static int checkData(int currentYear, String dob) {

        int dateOfBirth = Integer.parseInt(dob);
        int minimumYear = currentYear - 125;

        if ((dateOfBirth < minimumYear) || (dateOfBirth > currentYear)) {
            return -1;
        }
        return (currentYear - dateOfBirth);
    }
}
