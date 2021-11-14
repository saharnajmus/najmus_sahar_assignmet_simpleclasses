package be.intecbrussel;

import java.time.Instant;

public class Datetime {
    //Assignment2: instant
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant addSeconds = now.plusSeconds(7);
        Instant addMilliSeconds = addSeconds.plusMillis(5);
        Instant addNanoseconds = addMilliSeconds.plusNanos(3);
        System.out.println("After adding 7sec 5milliseconds and 3 nanoseconds to the current time " + addNanoseconds);


    }
}
