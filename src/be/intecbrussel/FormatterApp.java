package be.intecbrussel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatterApp {
    public static void main(String[] args) {
        //Chapter 12: Assignment 7
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a date in dd/MM/yyyy format ");
        String userInput = keyboard.next();

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate userDate = LocalDate.parse(userInput, inputFormat);

        String format = userDate.format(outputFormat);
        System.out.println(format);

    }
}
