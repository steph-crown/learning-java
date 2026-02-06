void main() {
//    Clock clock = new Clock();
//
//    while (true) {
//        System.out.println(clock);
//        clock.advance();
//    }

    Timer timer = new Timer();

    while (true) {
        System.out.println(timer);
        timer.advance();

        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }
    }
}