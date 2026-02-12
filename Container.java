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
            this.value = this.limit;
            return;
        }

        this.value += value;
    }

    public void remove(int value) {
        if (this.value - value < 0) {
            this.value = 0;
            return;
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
