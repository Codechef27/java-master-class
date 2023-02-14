public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(248387902));

    }

    public static int getEvenDigitSum(int number) {

        if (number < 0 ) {
            return -1;
        }

        int sum = 0;
        while (number != 0) {
            if ( number % 2 == 0) {
                int evenNumbers = number % 10;
                sum += evenNumbers;
            }
            number /= 10;
        }

        return sum;
    }
}
