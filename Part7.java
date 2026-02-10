void main() {
    int[] numbers = {-1, 6, 9, 8, 3};
    System.out.println("smallest " + Order.smallest(numbers));
    System.out.println("smallest " + Order.indexOfSmallest(numbers));
    System.out.println("smallest " + Order.indexOfSmallestFrom(numbers, 1));

    Order.swap(numbers, 0, 3);
    System.out.println(Arrays.toString(numbers));

    Order.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    System.out.println(Algorithms.linearSearch(numbers, 8));
}

