//import java.util.Scanner;
//
//public class LoginSystem {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        Admin admin = new Admin("Admin013", "password013", "Fery", 8560013);
//
//        Student student = new Student("Fery",8560013);
//
//        System.out.println("Choose login access :");
//        System.out.println("1. Admin");
//        System.out.println("2. Student");
//        System.out.println("3. Exit");
//        int choice = sc.nextInt();
//        sc.nextLine();
//
//        switch(choice) {
//            case 1:
//                System.out.println("Enter username : ");
//                String inputUsername = sc.nextLine();
//                System.out.println("Enter password : ");
//                String inputPassword = sc.nextLine();
//
//                if(admin.login(inputUsername,inputPassword)){
//                    System.out.println("Login Successful");
//                }else{
//                    System.out.println("Invalid username or password");
//                }
//                break;
//
//            case 2:
//                System.out.println("Enter Name : ");
//                String name = sc.nextLine();
//                System.out.println("Enter NIM : ");
//                int nim = sc.nextInt();
//
//                if(student.login(name,nim)) {
//                    student.displayInfo();
//                }else {
//                    System.out.println("Invalid Name or NIM");
//                }
//                break;
//            case 3:
//                 System.out.println("Exit");
//                 break;
//        }
//
//        sc.close();
//
//    }
//}
