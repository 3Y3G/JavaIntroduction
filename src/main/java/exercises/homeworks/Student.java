package exercises.homeworks;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class Student extends Person{

    public String sClass;

    public int numberInClass;

    public static List<String> gradesForSubjects = new LinkedList<>();

    public Student(String name, String gender, int id, String sClass, int numberInClass, String gradesForSubjects) {
        super(name, gender, id);
        this.sClass = sClass;
        this.numberInClass = numberInClass;
        this.gradesForSubjects.add(gradesForSubjects);
    }
    //subGrades.add("Math A+;English A-;Bulgarian D+;STEM D-");
    public void lowestGrade(String subject){
        String[] subjectsTemp;
        int[] grades = new int[3];
        for (int i = 0; i<gradesForSubjects.size(); i++){
            if (subject.toLowerCase().equals("math")){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                System.out.println(subjectsTemp[0].substring(5));
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(5).toString());
            }
            if (subject.toLowerCase() == "bulgarian"){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                System.out.println(subjectsTemp[1].substring(10));
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(10).toString());
            }
            if (subject.toLowerCase() == "english"){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                System.out.println(subjectsTemp[2].substring(8));
                grades[i] = Integer.parseInt(subjectsTemp[0].substring(8).toString());
            }
            if (subject.toLowerCase() == "stem"){
                subjectsTemp = gradesForSubjects.get(i).split(";");
                System.out.println(subjectsTemp[3].substring(5));
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
        System.out.println("nulata e " + temp);
        indexG = findIndex(grades, temp);
        System.out.println("index: "+ indexG);
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
}
