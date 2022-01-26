package com.careerdevs.asktheuser;

import java.util.Scanner;


public class UserInterface {


    public static void main(String[] args) {
        isBestMovie();
        stringResponse();
    }



    public static void isBestMovie() {

        //Scanner class
        Scanner scanner = new Scanner(System.in);

        //question printed to the terminal
        System.out.println("Is Spider-Man 2 the best superhero movie made?");
        System.out.println("(True or False)");

        //Response to user
        if (scanner.nextBoolean()) {
            System.out.println("Lets gooo! I'm glad we can agree");
        } else {
            System.out.println("Oh... I see...You don't think so? ");
            System.out.println("*PROGRAM TERMINATED*");

            System.out.println("...Just kidding. lolz");
        }
    }

    public static void stringResponse() {
        //Scanner class
        Scanner scanner = new Scanner(System.in);
        //Question printed to terminal
        System.out.println("What is your favorite video game?");
        //Used to store typed in answer from Scanner
        String favoriteVideoGame = scanner.nextLine();
        //Prints out reply
        System.out.println("Oh, really? " + favoriteVideoGame + " is my favorite too!");
    }
}
