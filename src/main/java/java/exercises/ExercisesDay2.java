package java.exercises;

import java.util.Scanner;

public class ExercisesDay2 {
    //04.07.2023
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
}
