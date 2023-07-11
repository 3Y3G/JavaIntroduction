package exercises;


import exercises.homeworks.Student;
import exercises.homeworks.Teacher;
import exercises.shapes.Rectangle;
import exercises.shapes.Triangle;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        ArrayList<Teacher> teacherArrayList = new ArrayList<>();
        ArrayList<String> studentTeacher = new ArrayList<>();

        List<String> subGrades = new ArrayList<>();
        subGrades.add("Math 2;English 6;Bulgarian 3;STEM 4");
        subGrades.add("Math 5;English 3;Bulgarian 6;STEM 2");
        subGrades.add("Math 6;English 4;Bulgarian 5;STEM 3");

        Student student = new Student("Pesho", "male", 1, "a", 5, subGrades.get(0));
        Student student2 = new Student("Viktoriq", "female", 5, "b", 5, subGrades.get(1));
        Student student3 = new Student("Ananas", "male", 3, "c", 5, subGrades.get(2));
        Teacher teacher = new Teacher("Naska", "female", 28, "Dimitar Talev", "Math", 1400);
        Teacher teacher2 = new Teacher("Denka", "female", 24, "Kiril I Metodii", "Geography", 5000);
        Teacher teacher3 = new Teacher("Kris", "male", 34, "Dimitar Talev", "Math", 1400);
        studentArrayList.add(student);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        teacherArrayList.add(teacher);
        teacherArrayList.add(teacher2);
        teacherArrayList.add(teacher3);
        for (int i = 0; i < studentArrayList.size(); i++){
            studentTeacher.add(studentArrayList.get(i).toString());
        }
        for (int i = 0; i < teacherArrayList.size(); i++){
            studentTeacher.add(teacherArrayList.get(i).toString());
        }
        for (int i = 0; i < studentTeacher.size(); i++){
            if (i == 0){
                System.out.println("Students: ");
            }
            if (i == studentArrayList.size()){
                System.out.println("Teachers: ");
            }
            System.out.println(studentTeacher.get(i));

        }


        System.out.println();
        student.lowestGrade("Math");
        student.highestGrade("STEM");
        student.averageGrade("Ananas");
        /*int a, b, c;
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
        myTriangle.calculatePerimeter(); */
    }
}