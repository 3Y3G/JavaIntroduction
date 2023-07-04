package training.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zadachi {
    public static void main(String[] args) {





        int[] numb = {2,4,5,7};
        System.out.println(Sum(numb));
    }
    static int Sum(int[] numbs){
        int sum = 0;
        for (int element: numbs) {
            sum = sum + element;
        }
        return sum;
    }
    static void Homework2Ex3(){
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
    static void Homework2Ex1(){
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
    static void ex5(){
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String element : days) {
            System.out.println(element + " ");
        }
    }
    static void ex4(){
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        if (weight > 50 && weight <= 70){
            System.out.println("skinny");
        }else if(weight > 70 && weight <= 90){
            System.out.println("skinny fat");
        }else if(weight > 90 && weight <= 110){
            System.out.println("obese");
        }else if (weight > 110){
            System.out.println("extra obese");
        }else{
            System.out.println("Out of bounds");
        }
    }
    static void ex3(){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
    static void ex2(){
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
    static void day1(){
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