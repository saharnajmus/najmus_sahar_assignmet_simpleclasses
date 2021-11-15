package be.intecbrussel;

import java.time.Instant;

public class Datetime {
    //Assignment2: instant
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant future = now.plusSeconds(7).plusMillis(5).plusNanos(3);
        System.out.println("instant " +now);
        System.out.println("After adding 7sec , 5milliseconds and 3 nanoseconds to the current time " + future);


    }
}
