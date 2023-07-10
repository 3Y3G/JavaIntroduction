package exercises;


import exercises.shapes.Rectangle;
import exercises.shapes.Triangle;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a of the rectangle: ");
        a = scanner.nextInt();
        System.out.println("Enter side b of the rectangle: ");
        b = scanner.nextInt();
        Rectangle myRectangle = new Rectangle(a, b);
        myRectangle.calculateArea();
        myRectangle.calculatePerimeter();
        System.out.println("Enter side a of the triangle: ");
        a = scanner.nextInt();
        System.out.println("Enter side b of the triangle: ");
        b = scanner.nextInt();
        System.out.println("Enter side c of the triangle: ");
        c = scanner.nextInt();
        Triangle myTriangle = new Triangle(a,b,c);
        myTriangle.calculateArea();
        myTriangle.calculatePerimeter();
    }
}