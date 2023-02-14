public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));

    }

    public static boolean isPalindrome(int number) {

      int reverse = 0;
      int palindrome = number;

     do {
         int lastDigit = number % 10;
         reverse = (reverse * 10) + lastDigit;
         number /= 10;

     } while (number !=0 );

     if ( palindrome == reverse) {
         return true;
     } else {
         return false;
     }
    }
}
