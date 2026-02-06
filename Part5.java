void main() {
//    ClockHand hours = new ClockHand(23);
//    ClockHand minutes = new ClockHand(59);
//    ClockHand seconds = new ClockHand(59);
//
//    while (true) {
//        System.out.println(hours + ":" + minutes + ":" + seconds);
//
//        seconds.advance();
//
//        if (seconds.value() == 0) {
//            minutes.advance();
//
//            if (minutes.value() == 0) {
//                hours.advance();
//            }
//        }
//    }
    Clock clock = new Clock();
    
    while (true) {
        System.out.println(clock);
        clock.advance();
    }
}