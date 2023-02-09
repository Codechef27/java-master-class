public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.print(hasEqualSum(2,2, 3));
    }

    public static boolean hasEqualSum(int a, int b, int c){

        if ((a + b) == c) {
            return true;
        } else return false;
    }
}
