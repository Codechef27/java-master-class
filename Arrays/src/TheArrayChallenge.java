import java.util.Arrays;
import java.util.Random;

public class TheArrayChallenge {

    public static void main(String[] args) {

        int[] array1 = getRandomArray(10);
        System.out.print(Arrays.toString(array1));

        int[] sortedArray = sortIntegers(new int[] {7, 33, 40, 5});
        System.out.println(Arrays.toString(sortedArray));
    }


    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    private static int[] sortIntegers(int[] array ){

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("---------> " + Arrays.toString(sortedArray));
                }
            }
            System.out.println("---------> " + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }

}
