package exercises.homeworks;


import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    public String school;

    public String subjects;

    public int salary;
    private static List<Integer> avgSalary = new ArrayList<>();

    public Teacher(String name, String gender, int id, String school, String subjects, int salary) {
        super(name, gender, id);
        this.school = school;
        this.subjects = subjects;
        this.salary = salary;
        avgSalary.add(salary);
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
