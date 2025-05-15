package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import java.util.Scanner;

public class Admin extends User implements AdminActions{

    public Admin( String username, String password) {
        super(username, password);

    }

    public boolean login(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void manageItems(){
        System.out.println("Manage Items feature is not available");
    }

    @Override
    public void manageUsers(){
        System.out.println("Manage Users feature is not available");
    }

    public void displayAppMenu(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Admin Menu:");
            System.out.println("1. Manage Item Reports");
            System.out.println("2. Manage Student Data");
            System.out.println("0. Logout");
            System.out.print("Choose an option: ");
            // Read input inside loop for each menu display
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Consume invalid input
                System.out.print("Choose an option: ");
            }
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch(choice){
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    System.out.println("Logout Success");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while(choice != 0);
        // Optionally, do not close the scanner here as it closes System.in
    }
}