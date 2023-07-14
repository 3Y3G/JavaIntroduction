package exercises.homeworks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Teacher extends Person{
    public String school;

    public String subjects;
    public static HashMap<String, String> subj = new HashMap<>();

    public int salary;
    private static List<Integer> avgSalary = new ArrayList<>();

    public Teacher(String name, String gender, int id, String school, String subjects, int salary) {
        super(name, gender, id);
        this.school = school;
        this.subjects = subjects.toLowerCase();
        this.salary = salary;
        avgSalary.add(salary);
        subj.put(subjects.toLowerCase(), name);
    }
    public void calcHighestGrade(){
        int[] mathRaw = Student.SeperateGrades("math");
        double math = 0d;
        for (int i : mathRaw){
            math = math + i;
        }
        math = math/mathRaw.length;

        int[] engRaw = Student.SeperateGrades("english");
        double eng = 0d;
        for (int i : engRaw){
            eng = eng + i;
        }
        eng = eng/engRaw.length;

        int[] bulgRaw = Student.SeperateGrades("bulgarian");
        double bulg = 0d;
        for (int i : bulgRaw){
            bulg = bulg + i;
        }
        bulg = bulg/bulgRaw.length;

        int[] stemRaw = Student.SeperateGrades("stem");
        double stem = 0d;
        for (int i : stemRaw){
            stem = stem + i;
        }
        stem = stem/stemRaw.length;

        double[] grades = new double[4];
        grades[0] = math;
        grades[1] = eng;
        grades[2] = bulg;
        grades[3] = stem;

        double temp = grades[0];

        for (double gr : grades) {
            if (temp < gr){
                temp = gr;
            }
        }

        if (temp == math){

            String who = subj.get("math");
            System.out.println("The teacher signing the highest grades is: " + who);
        }else if (temp == eng){

            String who = subj.get("english");
            System.out.println("The teacher signing the highest grades is: " + who);
        }else if(temp == bulg){

            String who = subj.get("bulgarian");
            System.out.println("The teacher signing the highest grades is: " + who);
        }else if(temp == stem){

            String who = subj.get("stem");
            System.out.println("The teacher signing the highest grades is: " + who);
        }
    }
    public void aSalary(){
        int temp = 0;
        for (int i = 0; i < avgSalary.size(); i++) {
            temp = temp + avgSalary.get(i);
        }
        temp = temp / avgSalary.size();
        System.out.println("The average salary is: " + temp);
    }
    private String info(){
        String info = "Name: " + name + "; Gender: " + gender + "; Id: " + id + "; School: " + school + "; Subject: " + subjects + "; Salary: " + salary;
        return info;
    }

    @Override
    public String toString() {
        return info();
    }
}
