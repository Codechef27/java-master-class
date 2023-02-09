public class LeapYearCalculator {

    public static void main(String[] args) {

        System.out.println(isLeapYear(921));

    }

    public static boolean isLeapYear(int year) {
        if ((year > 9999) || (year < 1)) {
            return false;

        } else if ((year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0)){
            return true;
        }
        else {
            return false;
        }

    }
}
