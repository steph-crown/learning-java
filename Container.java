public class Container {
    private int value;
    private final int limit;
    private final String name;

    public Container(String name, int limit) {
        this.value = 0;
        this.name = name;
        this.limit = limit;
    }

    public Container(String name) {
        this(name, Integer.MAX_VALUE);
    }

    public void add(int value) {
        if (this.value + value > this.limit) {
            throw new RuntimeException("exceeds_limit");
        }

        this.value += value;
        System.out.println(this.value);
    }

    public void remove(int value) {
        if (this.value - value < 0) {
            throw new RuntimeException("goes_below_0");
        }

        this.value -= value;
    }

    public int contains() {
        return this.value;
    }

    @Override()
    public String toString() {
        String limit = this.limit + "";

        if (this.limit == Integer.MAX_VALUE) {
            limit = "Infinity";
        }

        return this.name + ": " + this.value + "/" + limit;
    }
}
