package org.emailapp;

/**
 * This project is an exercise "Email Application" :
 * Scenario: You are an IT Support Administrator Specialist and are charged with the task of creating
 * email for new hires.
 * Application should do the following:
 * 1. Generate an email with the following syntax: firstname.lastname@department.company.com
 * 2. Determine the department (sales, development, accounting), if none leave blank
 * 3. Generate random String for a password
 * 4. Have set methods to  change the password, set the mailbox capacity, and define an alternate email
 * address
 * 5. Have get methods to dispalay the name, email and mailbox capacity
 *
 *
 * @author Kamil
 */

public class EmailApp {

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        Email em1 = new Email("John","Smith");

        System.out.println(em1.showInfo());


    }
}