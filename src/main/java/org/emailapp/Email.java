package org.emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";

    //konstruktor dla firstName i lastName/constructor for firstName and lastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //zapytanie iustawienie oddzaiłu/call method asking for dep and return dep
        this.department = setDepartment();

        //metoda generujaca random haslo/ call method that returns random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // generowanie adresu email z posiadanych danych//combine elemnts to generate email adress
        email = firstName.toLowerCase() + "" + lastName.toLowerCase() + "@" + department.toLowerCase() + "."
            + companySuffix;
        System.out.println("Your company email is: " + email);

    }

    //zapytanie o departament/ask for department
    private String setDepartment(){
        System.out.println("New worker: " + firstName + " Departament Code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter departament code:");
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

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    // Set the laternate email address
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = alternateEmail;
    }
    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity;}
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " +lastName +
                "\nCOMPANY MAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

}


