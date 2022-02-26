package com.bridgelabz;

import java.util.Scanner;

public class ValidationOfUserRegistration {
    Scanner scanner = new Scanner(System.in);

    public void validateFirstName() {
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        String regex = "^[a-z]{5,}|[A-Z][a-z]{2,}$";
        System.out.println(firstName.matches(regex));
    }


    public void validemail() {
        Scanner email = new Scanner(System.in);
        String gmail = email.next();
        System.out.println("enter valid gamail");
        String regex = "^[A-Za-z0-9-._]{1,}+@+[a-z]{1,}+.+[a-z]$";
        System.out.println(gmail.matches(regex));
    }

    public void ValidMobileNumber() {
        Scanner number = new Scanner(System.in);
        System.out.println(" enter a valid mobile number");
        String mobilenumber = number.next();
        String regex = "^[0-9]{2}|[0-9]{10}$";
        System.out.println(mobilenumber.matches(regex));

    }

    public void validatePasswordRuleOne(String password) {
        String regex = "^[A-Za-z0-9.-_@#$%&^*()+:?]{8,}$";
        System.out.println(password.matches(regex));
    }
    public void validatePasswordRuleTwo(String password){
        String regex = "^(?=.*[A-Z])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        System.out.println(password.matches(regex));
}
}