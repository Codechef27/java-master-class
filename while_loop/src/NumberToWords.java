public class NumberToWords {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1010));
//        System.out.println(reverse(1000));
//        System.out.println(reverse(100));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }

    public static void numberToWords(int number){

        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);
        int lastDigit = 0;

        while (digitCount > 0) {
            lastDigit = reversedNumber % 10;
            reversedNumber /= 10;
            digitCount--;


            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int numberReverse){
        int reverse = 0;

        while(numberReverse != 0) {
            reverse = reverse * 10 + numberReverse % 10;
            numberReverse /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;
        do {
            sum++;
            number /= 10;
        } while (number > 0);
        return sum;
    }


}
