package be.intecbrussel;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationApp {
    public static void main(String[] args) {
        //Chapter 12 : Assignment 6 : Duration:
        LocalDate nowDate = LocalDate.now();
        LocalDate myBirthDate = LocalDate.of(1991, 5, 14);
        Period period = Period.between(nowDate, myBirthDate);

        System.out.println("Number of days: " + period.getDays());
        System.out.println("Number of months: " + period.getMonths());
        System.out.println("Number of years: " + period.getYears());

        long days = ChronoUnit.DAYS.between(myBirthDate, nowDate);
        long weeks = ChronoUnit.WEEKS.between(myBirthDate, nowDate);
        long months = ChronoUnit.MONTHS.between(myBirthDate, nowDate);
        ;

        System.out.println("Total number of days between myBirth and now: " + days);
        System.out.println("Total number of weeks:  " + weeks);
        System.out.println("Total number of months: " + months);


    }

}
