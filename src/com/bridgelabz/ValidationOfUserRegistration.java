package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationOfUserRegistration {
    Scanner scanner = new Scanner(System.in);
    public void validateFirstName(){
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        String regex = "^[a-z]{5,}|[A-Z][a-z]{2,}$";
        System.out.println(firstName.matches(regex));
    }


 public void validemail() {
     Scanner email = new Scanner(System.in);
     String gmail = email.next();
     System.out.println("enter valid gamail");
     String regex =  "^[A-Za-z0-9-._]{1,}+@+[a-z]{1,}+.+[a-z]$";
     System.out.println(gmail.matches(regex));
 }
}
