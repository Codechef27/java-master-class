public class DayOfTheWeekSwitchCase {

    public static void main(String[] args) {

        printDayOfWeek(7);
        printDaysOfTheWeek(4);

    }

    public static void printDayOfWeek(int day) {

        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println(" Invalid Day ");
        }
    }

    public static void printDaysOfTheWeek(int day) {

        if(day == 0) {
            System.out.println("Sunday");
        }
        if(day == 1) {
            System.out.println("Monday");
        }
        if(day == 2) {
            System.out.println("Tuesday");
        }
        if(day == 3) {
            System.out.println("Wednesday");
        }
        if(day == 4) {
            System.out.println("Thursday");
        }
        if(day == 5) {
            System.out.println("Friday");
        }
        if(day == 6) {
            System.out.println("Saturday");
        } else if (day <0 || day >= 7) {
            System.out.println("Invalid Day");
        }
    }
}
