public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLast(10));

    }

    public static int sumFirstAndLast(int number) {

        int sum = 0;
        if ( number < 0 ) {
            return -1;
        } else {
            int lastDigit = 0;
            int firstDigit = number % 10;
            while (number != 0) {
                 lastDigit = number % 10;
                number /= 10;
                sum = firstDigit + lastDigit;
            }

            return sum;
        }


    }
}
