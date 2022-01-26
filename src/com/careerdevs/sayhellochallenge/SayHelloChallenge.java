package com.careerdevs.sayhellochallenge;
import java.util.Scanner;

public class SayHelloChallenge {

    public static void main(String[] args) {
        whatIsYourName();
    }



    public static void whatIsYourName() {
        Scanner scanner = new Scanner(System.in);

        //Asks for name and waits for input
        System.out.println("Please tell us your name.");
        String userName = scanner.nextLine();

        //Prints a greeting to the console
        System.out.println("Hello, " + userName + " Nice to meet you!");

    }
}
