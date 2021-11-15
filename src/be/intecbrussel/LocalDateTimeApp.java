package be.intecbrussel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeApp {
    public static void main(String[] args) {
        //Chapter 12: Assignment 4: Local dates and times
        LocalDate myDateOfBirth = LocalDate.of(2015, 1, 30);

        int dayOfYear = myDateOfBirth.getDayOfYear();
        int dayOfMonth = myDateOfBirth.getDayOfMonth();
        DayOfWeek dayOfWeek = myDateOfBirth.getDayOfWeek();

        System.out.println("My birthday was the " + dayOfYear + "th day of the year ");
        System.out.println("My birthday was the " + dayOfMonth + "th day of the month");
        System.out.println("I was born on  " + dayOfWeek);

        int year = myDateOfBirth.getYear();
        if (myDateOfBirth.isLeapYear()) {
            System.out.println("It was a leap year");
        } else {
            System.out.println("It was not a leap year");

        }

    }


    //Chapter 12: example
      /*  LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.now();

        LocalDate otherDate = LocalDate.of(2015,1,30);
        LocalTime otherTime = LocalTime.of(8,10,30);
        LocalDateTime otherDateTime = LocalDateTime.of(otherDate,otherTime);
        System.out.println("nowDate: " +nowDate );
        System.out.println("nowTime: " +nowTime );
        System.out.println("nowDateTime: " + nowDateTime );
        System.out.println("otherDate: " +otherDate );
        System.out.println("otherTime: " + otherTime );
        System.out.println("otherDateTime: " +otherDateTime );*/
}
