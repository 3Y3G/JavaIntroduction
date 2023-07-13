package exercises;


import exercises.exercises.Calculator;
import exercises.shapes.Rectangle;
import exercises.shapes.Triangle;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        calc.result(scanner.nextLine());
    }
}