package com.praktikum.main;

import com.praktikum.users.*;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user;

        System.out.println("Welcome to Lost & Found System");
        System.out.println("Please Login as (1:Admin, 2:Student)");
        int role=sc.nextInt();
        sc.nextLine();

        System.out.println("Please enter your username:");
        String username=sc.nextLine();
        System.out.println("Please enter your password:");
        String password=sc.nextLine();

        if(role==1){
            user=new Admin("Admin","Admin013");
        }else if(role==2){
            user=new Student("Fery","08560013");
        }else{
            System.out.println("Invalid Role");
            return;
        }

        if(user.login(username,password)){
            System.out.println("Login Success");
            user.displayAppMenu();
        }else{
            System.out.println("Login Failed");
        }




    }
}


