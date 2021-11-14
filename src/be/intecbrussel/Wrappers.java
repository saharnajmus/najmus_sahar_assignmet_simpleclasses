package be.intecbrussel;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
        //Chapter 12: Simple Classes
        //Assignment 1 part 1
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.sum(55, 90));
        System.out.println(Integer.max(90, 900));
        //Assignment 1 part 2
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string value");
        String input = keyboard.next();
        //Assignment 1 part 3,4,5,6
        Integer convertToInt = Integer.parseInt(input);
        System.out.println(convertToInt);
        System.out.println("Number of bits used to represent an integer value is " + Integer.SIZE);
        System.out.println("Number of bytes used to represent an integer value is " + Integer.BYTES);


    }
}
