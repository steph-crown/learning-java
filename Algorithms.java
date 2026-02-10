public class Algorithms {
    public static int linearSearch(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] array, int searched) {
        int l = 0;
        int r = array.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (array[mid] < searched) {
                l = mid + 1;
            } else if (array[mid] > searched) {
                r = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
