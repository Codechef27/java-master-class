public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));


    }

    public static String getDurationString(int seconds){

        if (seconds < 0) {
            return "Invalid Data ( " + seconds + "), must be a positive integer value";
        }


        return getDurationString(seconds / 60 ,seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){

        if (minutes < 0) {
            return "Invalid Data ( " + minutes + "), must be a positive integer value";
        }

        if (seconds <= 0 || seconds >= 59 ) {
            return "Invalid Data ( " + seconds + "), must be a value between 0 and 59";

        }

        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;
        return hours + "h " + remainderMinutes + "m " + seconds + "s";

    }

}