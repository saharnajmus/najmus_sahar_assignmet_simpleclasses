package be.intecbrussel;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZone {
    //Chapter 12 Assignment 5:Times with TimeZone
    public static void main(String[] args) {
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZoneId adelaideZone = ZoneId.of("Australia/Adelaide");
        ZoneId utcMinus4 = ZoneId.of("UTC-4");

        ZonedDateTime nowHere = ZonedDateTime.now();
        ZonedDateTime nowLondon = ZonedDateTime.now(londonZone);
        ZonedDateTime nowSydney = ZonedDateTime.now(sydneyZone);
        ZonedDateTime nowAdelaide = ZonedDateTime.now(adelaideZone);
        ZonedDateTime nowUtcMinus4 = ZonedDateTime.now(utcMinus4);

        System.out.println("nowHere: " + nowHere);
        System.out.println("nowLondon: " + nowLondon);
        System.out.println("nowSydney: " + nowSydney);
        System.out.println("nowAdelaide: " + nowAdelaide);
        System.out.println("NowUtc-4: " + nowUtcMinus4);

    }
}
