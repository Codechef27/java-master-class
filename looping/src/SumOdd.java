public class SumOdd {

    public static void main(String[] args) {

        System.out.println("The sum of odd numbers between 1 and 100 = " + sumOdd(1, 100));

    }

    public static boolean isOdd(int number) {

        if ((number < 0) || (number % 2 == 0)) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {

        if((start < 0) || ( end < 0) || (end < start)) {
            return -1;
        }
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sum += i ;
            }
        } return sum;
    }
}
