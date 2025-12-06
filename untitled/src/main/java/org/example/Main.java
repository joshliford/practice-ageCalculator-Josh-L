package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take in age from user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // calculate years left until they are 100 years old
        int yearsLeft = 100 - age;

        // return message to user
        System.out.print("You have " + yearsLeft + " years left until you are 100 years old!");
    }
}