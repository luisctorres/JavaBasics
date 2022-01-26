package com.careerdevs;

public class Main {

    public static void main(String[] args) {
	String firstName = "Luis";
    String lastName = "Torres";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
    createFullName("First", "Last");
    }

    public static void createFullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);

    }



}



