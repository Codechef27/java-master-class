public class SpeedConverter {

    public static void main(String[] args) {

    }

    public static long toMilesPerHour(double kilometersPerHour) {


        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        long miles = 0;
        miles = toMilesPerHour(kilometersPerHour);



        System.out.println(kilometersPerHour +"km/h =" + miles + "mi/h");
    }
}
