public class SwitchStatement {

    public static void main(String[] args) {


        int switchValue = 5;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, 4, or 5.");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4, or 5");
        }

        String month = "January";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "Invalid Month";
        };
    }
}
