public class Order {
    public static int smallest(int[] arr) {
        int val = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < val) {
                val = num;
            }
        }

        return val;
    }
}
