public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(1051200);

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long years = minutes / (60 * 24 * 365);
            long remainingMinutes = minutes % (60 * 24 * 365);
            long days = remainingMinutes / (24 * 60);
            System.out.println(minutes + " minutes = " + years + "y and" + days + "d");
        }

    }

}
