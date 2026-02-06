public class ClockHand {
    private int value;
    private final int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        if (this.value >= this.limit) {
            this.value = 0;
        } else {
            this.value += 1;
        }
    }

    public int value() {
        return this.value;
    }

    @Override()
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return this.value + "";
    }
}
