package java.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercisesDay3 {
    static void exercise1(){
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        int fives = 0;
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println("All negative numbers are: ");
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                System.out.println(nums[i]);
            }
        }
        System.out.println("All positive numbers are: ");
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 >= 0){
                System.out.println(nums[i]);
            }
        }
        System.out.println("All even numbers are: ");
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                System.out.println(nums[i]);
            }
        }
        System.out.println("All odd numbers are: ");
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 1){
                System.out.println(nums[i]);
            }
        }
        System.out.println("The number of fives is: ");
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 5){
                fives = fives + 1;
            }
        }
        System.out.println(fives);
    }
    static void exercise2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter next string: ");
        String string2 = scanner.nextLine();
        String string4 = string1.replace(string2, "");
        System.out.println(string4);
    }
    static void exercise3(){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String reversed = "";
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            reversed = words[i] + " " + reversed;
        }

        //Printing the reversed sentence
        System.out.println("Reversed sentence: " + reversed);
    }
    static void exercise4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        String[] names = name.split(" ");
        String initials = "";
        for (int i = 0; i < names.length; i++){
            initials = initials + names[i].substring(0,1);
        }
        System.out.println("Your initials are: " + initials);
    }
    static void exercise5(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList();
        String temp = "";
        for (int i = 0; i < 4; i++){
            System.out.println("Enter a word: ");
            words.add(scanner.nextLine());
        }
        temp = words.get(0);
        words.set(0, words.get(words.size()-1));
        words.set(words.size()-1, temp);
        System.out.println(words);
    }
}
