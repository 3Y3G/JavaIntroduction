package training.day2;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean userLogin = false;
        while (!userLogin){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter username: ");
            String name = scanner.nextLine();
            System.out.println("Enter password: ");
            String pass = scanner.nextLine();

            if (name.equals("Ivan") && pass.equals("1234")){
                System.out.println("Welcome, " + name);
                userLogin = true;
            }else{
                System.out.println("Wrong credentials!");
            }
        }
    }
    static void dayOne(){
        //03.07.2023
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println((char)21328);
    }

    static void homework1(){
        //HOMEWORK 03.07.2023
        Scanner in = new Scanner(System.in);
        String day;
        System.out.println("Enter value between 1 and 7: ");
        int a = in.nextInt();
        switch (a) {
            case 1: day = "Monday";
                break;
            case 2: day = "Tuesday";
                break;
            case 3: day = "Wednesday";
                break;
            case 4: day = "Thursday";
                break;
            case 5: day = "Friday";
                break;
            case 6: day = "Saturday";
                break;
            case 7: day = "Sunday";
                break;
            default: day = "No such day!";
                break;

        }
        System.out.println("The day is: " + day);
    }
}