package com.company;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String args[])
    {
        String knownPassword  = "thecakeisalie";

        System.out.print("Enter your Username : ");
        Scanner s = new Scanner(System.in);
        String username = s.nextLine();

        System.out.print("What is the password ? : ");
        String password = s.nextLine();

        if(knownPassword.equals(password))
        {
            System.out.println("Salutaions!");
        }
        else
        {
            System.out.println("Who are you?");
        }

    }

}
