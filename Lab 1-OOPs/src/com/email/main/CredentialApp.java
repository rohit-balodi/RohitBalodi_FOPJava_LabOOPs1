package com.email.main;

import com.email.model.Employee;
import com.email.service.CredentialService;

import java.util.Scanner;

public class CredentialApp {

    public static void main(String[] args) {

        Employee employee = new Employee();
        CredentialService service = new CredentialService();

        System.out.println("Please enter the department from the following:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner sc = new Scanner(System.in);
        int department = sc.nextInt();

        switch (department) {

            case 1 -> {
                System.out.println();
                employee.setFirstName("Himanshu");
                employee.setLastName("Sharma");
                service.showCredentials("Himanshu");
                service.generateEmailAddress("himanshu", "sharma", "tech");
                service.generatePassword();
            }
            case 2 -> {
                System.out.println();
                employee.setFirstName("Nikhita");
                employee.setLastName("Gautam");
                service.showCredentials("Nikhita");
                service.generateEmailAddress("nikhita", "gautam", "admin");
                service.generatePassword();
            }
            case 3 -> {
                System.out.println();
                employee.setFirstName("Disha");
                employee.setLastName("Sharma");
                service.showCredentials("Disha");
                service.generateEmailAddress("disha", "sharma", "hr");
                service.generatePassword();
            }
            case 4 -> {
                System.out.println();
                employee.setFirstName("Ashu");
                employee.setLastName("Singh");
                service.showCredentials("Ashu");
                service.generateEmailAddress("ashu", "singh", "legal");
                service.generatePassword();
            }
            default -> System.out.println("Invalid Input, try again!");
        }


    }
}
