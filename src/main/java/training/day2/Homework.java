package training.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {

    static void homework2Ex3(){
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = new ArrayList<>();
        wordsList.add(scanner.nextLine());
        wordsList.add(scanner.nextLine());
        wordsList.add(scanner.nextLine());
        wordsList.add(scanner.nextLine());
        for (int i = 0; i < wordsList.size(); i++){
            if (wordsList.get(i).toCharArray().length > 4){
                wordsList.remove(i);
            }
        }
        System.out.println(wordsList);
    }
    static int homework2Ex2(int[] numbs){
        int sum = 0;
        for (int element: numbs) {
            sum = sum + element;
        }
        return sum;
    }
    static void homework2Ex1(){
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];
        System.out.println("Enter 5 words.");
        for (int i = 0; i < 5; i++){
            System.out.println("Enter a word: ");
            words[i] = scanner.nextLine();
        }
        String temp;
        for (int i = 0; i < words.length; i++){
            for (int j = 0 ; j < words.length; j++){
                if (words[i].charAt(0) == 'a') {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (String name : words) {
            System.out.println( name + " ");
        }
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
