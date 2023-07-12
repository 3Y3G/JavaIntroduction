package exercises.homeworks;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;


public class Student extends Person{


    private static int count = 0;
    public String sClass;

    public int numberInClass;
    public static HashMap<String, Integer> stun = new HashMap<>();


    public static List<String> gradesForSubjects = new LinkedList<>();

    public Student(String name, String gender, int id, String sClass, int numberInClass, String gradesForSubjects) {

        super(name, gender, id);
        this.sClass = sClass;
        this.numberInClass = numberInClass;
        Student.gradesForSubjects.add(gradesForSubjects);
        stun.put(name, count);
        count++;
    }
    //subGrades.add("Math 6;English 6;Bulgarian 4;STEM 6");

    public void highGrade(String name) {
        int who = Integer.parseInt(stun.get(name).toString());
        String info = gradesForSubjects.get(who);

        int[] grades = new int[4];
        String[] subjectsTemp;

        if (info.toLowerCase().contains("math")){
            subjectsTemp = gradesForSubjects.get(who).split(";");
            grades[0] = Integer.parseInt(subjectsTemp[0].substring(5));
        }
        if (info.toLowerCase().contains("english")){
            subjectsTemp = gradesForSubjects.get(who).split(";");
            grades[1] = Integer.parseInt(subjectsTemp[1].substring(8));
        }
        if (info.toLowerCase().contains("bulgarian")){
            subjectsTemp = gradesForSubjects.get(who).split(";");
            grades[2] = Integer.parseInt(subjectsTemp[2].substring(10));
        }
        if (info.toLowerCase().contains("stem")){
            subjectsTemp = gradesForSubjects.get(who).split(";");
            grades[3] = Integer.parseInt(subjectsTemp[3].substring(5));
        }
        int temp = grades[0];
        int indexG = 0;
        for (int gr : grades) {
            if (temp < gr){
                temp = gr;
            }
        }
        indexG = findIndex(grades, temp);
        String subject;
        switch(indexG) {
            case 0:
                subject = "Math";
                break;
            case 1:
                subject = "English";
                break;
            case 2:
                subject = "Bulgarian";
                break;
            case 3:
                subject = "STEM";
                break;
            default:
                subject = "null";
        }
        System.out.println("The highest grade for " + name + " is " + temp + " in " + subject);




        /*for(Entry<String, Integer> entry: stun.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue() == indexG) {
                System.out.println("Highest grade in " + subject + " is: " + entry.getKey());
                break;
            }
        }*/
    }


    public void averageGrade(String student){
        int who = Integer.parseInt(stun.get(student).toString());
        int[] grades = new int[4];
        String[] subjectsTemp;
        for (int i = 0; i < gradesForSubjects.size(); i++){
            subjectsTemp = gradesForSubjects.get(who).split(";");
            grades[0] = Integer.parseInt(subjectsTemp[0].substring(5));
            grades[1] = Integer.parseInt(subjectsTemp[1].substring(8));
            grades[2] = Integer.parseInt(subjectsTemp[2].substring(10));
            grades[3] = Integer.parseInt(subjectsTemp[3].substring(5));

        }
        double average = 0;
        for (int gr : grades) {
            average = average + gr;
        }
        average = average/4;
        System.out.println("The average grade of student " + student + " is: " + average);

    }

    public void highestGrade(String subject) {
        int[] grades = new int[count];
        String[] subjectsTemp;

        for (int i = 0; i < gradesForSubjects.size(); i++) {
            if (subject.equalsIgnoreCase("math")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(5));
            }
            if (subject.equalsIgnoreCase("english")) {
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[1].substring(8));
            }
            if (subject.equalsIgnoreCase("bulgarian")) {
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[2].substring(10));
            }
            if (subject.equalsIgnoreCase("stem")) {
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[3].substring(5));
            }
        }

        int temp = grades[0];
        int indexG = 0;
        for (int gr : grades) {
            if (temp < gr){
                temp = gr;
            }
        }
        indexG = findIndex(grades, temp);
        for(Entry<String, Integer> entry: stun.entrySet()) {
            if(entry.getValue() == indexG) {
                System.out.println("Highest grade in " + subject + " is: " + entry.getKey());
                break;
            }
        }
    }

    public void lowestGrade(String subject){
        int[] grades = new int[count];
        String[] subjectsTemp;

        for (int i = 0; i<gradesForSubjects.size(); i++){
            if (subject.equalsIgnoreCase("math")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(5));
            }
            if (subject.equalsIgnoreCase("english")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(8));
            }
            if (subject.equalsIgnoreCase("bulgarian")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(10));
            }
            if (subject.equalsIgnoreCase("stem")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(5));
            }
        }
        int temp = grades[0];
        int indexG = 0;
        for (int gr : grades) {
            if (temp > gr){
                temp = gr;
            }
        }


        indexG = findIndex(grades, temp);

        for(Entry<String, Integer> entry: stun.entrySet()) {
            if(entry.getValue() == indexG) {
                System.out.println("Lowest grade in " + subject + " is: " + entry.getKey());
                break;
            }
        }

    }
    public static int findIndex(int[] arr, int t)
    {

        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = 0;

        while (i < len) {

            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    private String info(){
        int who = Integer.parseInt(stun.get(name).toString());
        return "Name: " + name + "; Gender: " + gender + "; Id: " + id + "; Class: " + sClass + "; Number in class: " + numberInClass + "; Grades: " + gradesForSubjects.get(who);
    }

    @Override
    public String toString() {
        return info();
    }
}
