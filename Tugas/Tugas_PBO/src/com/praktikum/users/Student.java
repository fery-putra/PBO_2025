package com.praktikum.users;

import com.praktikum.actions.StudentActions;
import java.util.Scanner;

public class Student extends User implements StudentActions {
    public Student(String username, String password){
        super(username,password);
    }


    @Override
    public boolean login(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }

    public void reportItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Item Title : ");
        String name=sc.nextLine();
        System.out.println("Enter Item Description : ");
        String desc=sc.nextLine();
        System.out.println("Enter last location found: ");
        String location=sc.nextLine();
        System.out.println("Report Item Success");
    }

    @Override
    public void viewReportedItems(){
        System.out.println("View Report Features is not available");
    }

    @Override
    public void displayAppMenu(){
        Scanner sc = new Scanner(System.in);
        // Inside displayAppMenu
        int choice;
        do {
            System.out.println("Student Menu:");
            System.out.println("1. Report Found/Lost Items");
            System.out.println("2. View Reported Items");
            System.out.println("0. Logout");
            System.out.print("Choose an option: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Consume invalid input
                System.out.print("Choose an option: ");
            }
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch(choice) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout Success");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (choice != 0);
    }


}