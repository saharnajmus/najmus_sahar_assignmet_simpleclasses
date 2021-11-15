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

        System.out.println("Enter a number");
        if(keyboard.hasNextInt()){
            String input = keyboard.next();
            System.out.println(input+input);
            System.out.println("The integer value of your input is" + Integer.valueOf(input));
            System.out.println("The bit value of your input is" + Integer.bitCount(Integer.parseInt(input)));
            System.out.println("The integer value of your input is" + Integer.valueOf(input).byteValue());


        }
        else{
            System.out.println("Try again. This time just press int number");
        }


    }
}
