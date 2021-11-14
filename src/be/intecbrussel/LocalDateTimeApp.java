package be.intecbrussel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeApp {
    public static void main(String[] args) {
        //Chapter 12: Assignment 4: Local dates and times
        LocalDate myDateOfBirth = LocalDate.of(1991, 5, 14);
        int myBirthDayInYear = myDateOfBirth.getDayOfYear();
        int myBirthDayInMonth = myDateOfBirth.getDayOfMonth();
        DayOfWeek myBirthDayInWeek = myDateOfBirth.getDayOfWeek();
        System.out.println("My birthday was the " + myBirthDayInYear + "th day of the year ");
        System.out.println("My birthday was the " + myBirthDayInMonth + "th day of the month");
        System.out.println("I was born on  " + myBirthDayInWeek);
        int year = myDateOfBirth.getYear();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("your birthday year was a leap year");
        } else {
            System.out.println("your birthday year was not a leap year");

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
