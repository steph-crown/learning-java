import java.util.Arrays;

public class Order {
    public static int smallest(int[] arr) {
        int smallestIndex = indexOfSmallest(arr);

        if (smallestIndex == -1) {
            return Integer.MAX_VALUE;
        }

        return arr[smallestIndex];
    }

    public static int indexOfSmallest(int[] arr) {
        return indexOfSmallestFrom(arr, 0);
    }

    public static int indexOfSmallestFrom(int[] arr, int startIndex) {
        int val = Integer.MAX_VALUE;
        int index = -1;

        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < val) {
                val = arr[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = indexOfSmallestFrom(arr, i);
            swap(arr, i, smallestIndex);
            System.out.println(Arrays.toString(arr));
        }
    }
}
