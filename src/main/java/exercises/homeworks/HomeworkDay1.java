package exercises.homeworks;

import java.util.Scanner;

public class HomeworkDay1 {
    //HOMEWORK 03.07.2023
    static void homework1() {

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
