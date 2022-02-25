package com.bridgelabz;

import java.util.Scanner;

public class ValidationOfUserRegistration {
    Scanner scanner = new Scanner(System.in);
    public void validateFirstName(){
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(firstName.matches(regex));
    }
}
