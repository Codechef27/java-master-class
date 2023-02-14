public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number){
        if(number <= 0 ) {
            return false;
        }

        int i = 1;
        int sum = 0;

        while (((number / 2) + 1) != i) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        } return number == sum;
    }
}
