/**
 *
 * @author Joseph Ayo
 * 1/26/2025
 * Project Assignment M4 - CSD 402
 * Program Function: Calculate the average values of different array types.
 */
public class ArrayAverage {

    // Calculate the average of a short array
    public static short average(short[] array) {
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {1, 2, 3, 4, 5};
        int[] intArray = {10, 20, 30};
        long[] longArray = {100L, 200L, 300L, 400L};
        double[] doubleArray = {5.5, 6.6, 7.7, 8.8, 9.9};

        // Short array
        System.out.println("Short array: " + arrayToString(shortArray));
        System.out.println("Average of short array: " + average(shortArray));
        System.out.println();

        // Int array
        System.out.println("Int array: " + arrayToString(intArray));
        System.out.println("Average of int array: " + average(intArray));
        System.out.println();

        // Long array
        System.out.println("Long array: " + arrayToString(longArray));
        System.out.println("Average of long array: " + average(longArray));
        System.out.println();

        // Double array
        System.out.println("Double array: " + arrayToString(doubleArray));
        System.out.println("Average of double array: " + average(doubleArray));
    }

    // Convert array to string 
    public static String arrayToString(short[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String arrayToString(long[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
