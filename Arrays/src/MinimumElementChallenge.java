import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("Minimum integer = " + returnedMin);

        reverse(returnedArray);
        System.out.println("Reversed array = " + Arrays.toString(returnedArray));


        int[]reverseCopy = reverseCopy(returnedArray);
        System.out.println("After reverse = " + Arrays.toString(returnedArray));
        System.out.println("reversed copy = " + Arrays.toString(reverseCopy));
    }

    private static int[] readIntegers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas");
        String input = scan.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int element : array) {
            if(element < min) {
                min = element;
            }
        }
        return min;
    }


    public static void reverse(int[] array){

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++) {

            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("-----> " + Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for(int el : array) {
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }

}
