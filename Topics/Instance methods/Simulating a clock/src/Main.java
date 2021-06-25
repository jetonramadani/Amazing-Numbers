class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        ++minutes;
        if (minutes >= 60) {
            hours++;
            minutes -= 60;
            if (hours > 12) {
                hours = 1;
            }
        }
    }
}