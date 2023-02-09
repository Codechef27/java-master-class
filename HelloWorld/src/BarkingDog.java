public class BarkingDog {

    public static void main(String[] args) {
     shouldWakeUp(true, 6);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking && ((hourOfDay >= 0) && (hourOfDay < 8)) || ((hourOfDay > 22) && (hourOfDay <= 23))) {

            return true;
        }

        else {
            return false;
        }


    }
}
