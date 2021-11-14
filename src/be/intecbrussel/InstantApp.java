package be.intecbrussel;

import java.time.Instant;

public class InstantApp {
    //Example:Datetime
    public static void main(String[] args) {
        System.out.println(Instant.EPOCH);
        System.out.println(Instant.MAX);
        System.out.println(Instant.MIN);
        Instant now = Instant.now();
        System.out.println("now " + now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        Instant earlier = now.minusSeconds(20);
        System.out.println(earlier);
        Instant later = now.plusSeconds(20);
        System.out.println(later);

        System.out.println(now.isAfter(earlier));
        System.out.println(now.isBefore(later));


    }
}
