public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(hasSameLastDigit(11,23,334));

    }

    public static boolean hasSameLastDigit(int x, int y, int z) {

        int xx = x % 10;
        int yy = y % 10;
        int zz = z % 10;

        if((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000)) {
            return false;
        }
        if(( xx == yy || xx == zz) || (yy == zz)) {
            return true;
        }

        else {
            return false;
        }
    }

    public static boolean isValid(int a) {
        if (a < 10 || a > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
