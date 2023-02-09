public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(2.176,3.176));

    }

    public static boolean areEqualByThreeDecimalPlaces( double firstDecimalPlaces, double secondDecimalPlaces){



        return (int) (firstDecimalPlaces * 1000) == (int) (secondDecimalPlaces * 1000);
    }
}
