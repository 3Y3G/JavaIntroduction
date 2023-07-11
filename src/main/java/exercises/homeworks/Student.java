package exercises.homeworks;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;


public class Student extends Person{


    private static int cnt = 0;
    public String sClass;

    public int numberInClass;
    public static HashMap<String, Integer> stun = new HashMap();


    public static List<String> gradesForSubjects = new LinkedList<>();

    public Student(String name, String gender, int id, String sClass, int numberInClass, String gradesForSubjects) {

        super(name, gender, id);
        this.sClass = sClass;
        this.numberInClass = numberInClass;
        this.gradesForSubjects.add(gradesForSubjects);
        stun.put(name, cnt);
        cnt++;
    }
    //subGrades.add("Math 6;English 6;Bulgarian 4;STEM 6");

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
    public void highestGrade(String subject){
        int[] grades = new int[3];
        String[] subjectsTemp;

        for (int i = 0; i < gradesForSubjects.size(); i++){
            if (subject.toLowerCase().equals("math")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(5).toString());
            }
            if (subject.toLowerCase().equals("english")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[1].substring(8).toString());
            }
            if (subject.toLowerCase().equals("bulgarian")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[2].substring(10).toString());
            }
            if (subject.toLowerCase().equals("stem")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[3].substring(5).toString());
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

            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue() == indexG) {
                System.out.println("Highest grade in " + subject + " is: " + entry.getKey());
                break;
            }
        }
    }

    public void lowestGrade(String subject){
        int[] grades = new int[3];
        String[] subjectsTemp;

        for (int i = 0; i<gradesForSubjects.size(); i++){
            if (subject.toLowerCase().equals("math")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(5).toString());
            }
            if (subject.toLowerCase() == "english"){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(8).toString());
            }
            if (subject.toLowerCase() == "bulgarian"){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(10).toString());
            }
            if (subject.toLowerCase() == "stem"){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(5).toString());
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

            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue() == indexG) {
                System.out.println("Lowest grade in " + subject + " is: " + entry.getKey());
                break;
            }
        }

    }
    public static int findIndex(int arr[], int t)
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
        String info = "Name: " + name + "; Gender: " + gender + "; Id: " + id + "; Class: " + sClass + "; Number in class: " + numberInClass + "; Grades: " + gradesForSubjects.get(who);
        return info;
    }

    @Override
    public String toString() {
        return info();
    }
}
