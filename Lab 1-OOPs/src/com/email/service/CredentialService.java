package com.email.service;

import java.util.Arrays;
import java.util.Random;

public class CredentialService {

    public void generatePassword() {
        String num = "0123456789";
        String capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallletters = "abcdefghijklmnopqrstuvwxyz";
        String specialcharacters = "!@#$%^&*()/-+.<>?_=`~";

        String combinationofpassword = capitalletters + smallletters + specialcharacters;

        Random random = new Random();
        char[] password = new char[8];

        for (int i =0; i < 8; i++)
        password[i] = combinationofpassword.charAt(random.nextInt(combinationofpassword.length()));
            System.out.println("Password ---> " + Arrays.toString(password));
    }

    public void generateEmailAddress(String firstName, String lastName, String department) {
        System.out.println("Email ID ---> " + firstName + "." + lastName + "@" + department + ".abc.com");
    }

    public void showCredentials(String firstName) {
        System.out.println("Dear, " + firstName + " your generated credentials are as follows:");
    }
}


