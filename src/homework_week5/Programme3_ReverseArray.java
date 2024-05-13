package homework_week5;

import java.util.Arrays;
/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Programme3_ReverseArray {

    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        reverseOriginalArray(originalArray);
    }


    // static method to reverse array
    public static void reverseOriginalArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        for (int i = 0; i < array.length / 2; i++) {
            int number = array[start];
            array[start] = array[end];
            array[end] = number;
            start = start + 1;
            end = end - 1;
        }
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
}
