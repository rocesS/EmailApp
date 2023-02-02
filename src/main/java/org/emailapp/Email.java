package org.emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    //konstruktor dla firstName i lastName/constructor for firstName and lastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED " +this.firstName + " " + this.lastName);

        //zapytanie iustawienie oddzaiłu/call method asking for dep and return dep
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //metoda generujaca random haslo/ call method that returns random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

    }

    //zapytanie o departament/ask for department
    private String setDepartment(){
        System.out.println("DEPARTAMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter departament code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "Sales"; }
        else if (depChoice == 2) { return "Development"; }
        else if (depChoice == 3) { return "Accounting"; }
        else  { return "" ;}

    }

    //generate random password
    private String randomPassword(int length) {
        String passwordSet = "AaBbCcDdEeFfGgHhIjKkLlMmNnOpRrSsTtUuWwQqXxYyZz1234567890!@#$%^&*()";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }


}


