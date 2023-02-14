public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(greatestCommonDivisor(25, 15));
        System.out.println(greatestCommonDivisor(12, 30));
        System.out.println(greatestCommonDivisor(9, 18));
        System.out.println(greatestCommonDivisor(81, 153));

    }

    public static int greatestCommonDivisor(int first, int second){

        if((first < 10) || second < 10) {
            return -1;
        }

        while (first != second) {
            if(first > second) {
                first = first - second;
            } else {
                second = second - first;
            }
        }
        return first;


    }
}
