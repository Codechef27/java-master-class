import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scan = new Scanner(System.in);

        int xx = 0, num;
        double yy = 0;
        double loops = 0;
        boolean charEntered = false;

        do {
            if(scan.hasNextInt()) {
                loops++;
                num = scan.nextInt();
                xx += num;
                yy = (xx / loops);
            } else {
                System.out.println("SUM = " + xx + " AVG = "+ ((long)Math.round(yy)));
                charEntered = true;
            }

        } while(!charEntered);


    }
}
