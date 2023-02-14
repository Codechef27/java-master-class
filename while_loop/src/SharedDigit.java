public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 22));
        System.out.println(hasSharedDigit(15, 33));
        System.out.println(hasSharedDigit(9, -10));
        System.out.println(hasSharedDigit(19, 99));

    }

    public static boolean hasSharedDigit(int a, int b) {

        int firstA = a / 10;
        int lastA = a % 10;
        int firstB = b /10;
        int lastB = b % 10;

        if((a < 10 || a > 99) || (b < 10 || b > 99)) {

            return false;
        } if((firstA == firstB) || (firstA == lastB) || (lastA == firstB) || (lastA == lastB))  {
            return true;
        } else {
            return false;
        }


    }
}
