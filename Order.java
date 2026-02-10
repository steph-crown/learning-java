public class Order {
    public static int smallest(int[] arr) {
        int smallestIndex = indexOfSmallest(arr);

        if (smallestIndex == -1) {
            return Integer.MAX_VALUE;
        }

        return arr[smallestIndex];
    }

    public static int indexOfSmallest(int[] arr) {
        int val = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < val) {
                val = arr[i];
                index = i;
            }
        }

        return index;
    }
}
