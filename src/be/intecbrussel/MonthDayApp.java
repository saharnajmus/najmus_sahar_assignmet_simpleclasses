package be.intecbrussel;

import java.time.*;
import java.util.Locale;
import java.util.Scanner;

public class MonthDayApp {
    public static void main(String[] args) {
        //Assignment 3:Weekdays and Months
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a day of the week from 1(Monday) to 7(Sunday)");
        int day = keyboard.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.of(day);
        System.out.format("%s %n", dayOfWeek);
        DayOfWeek addMoreDays = dayOfWeek.plus(10);
        DayOfWeek subtractDays = dayOfWeek.minus(5);
        System.out.println("After adding 10 days " + addMoreDays);
        System.out.println("After subtracting 5 days " + subtractDays);

        System.out.println("Enter a month of the year from 1(january) to 12(december)");
        int monthOfYear = keyboard.nextInt();
        Month month = Month.of(monthOfYear);
        System.out.format("%s %n", month);
        Month addMonths = month.plus(10);
        Month subtractMonths = month.minus(5);
        System.out.println("After adding 10 months" + addMonths);
        System.out.println("After subtracting 5 months " + subtractMonths);


        //Chapter 12 Example
      /*  for(Month m: Month.values()){
            System.out.format("%s : [%d,%d] %n" , m, m.minLength(), m.maxLength());
        }
        for(DayOfWeek d : DayOfWeek.values()){
            // System.out.format("%s %n" , d);
            System.out.println(d);
        }*/
    }
}
