package java.homeworks;

import java.util.Scanner;

public class HomeworkDay3 {
    static void homework3Ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int[] numbs = new int[3];
        numbs[0] = scanner.nextInt();
        numbs[1] = scanner.nextInt();
        numbs[2] = scanner.nextInt();
        int lowest = numbs[1];
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] < lowest){
                lowest = numbs[i];
            }
        }
        System.out.println("Lowest number is: " + lowest);
    }
    static void homework3Ex2() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number%2 == 0){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }

}
