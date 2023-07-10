package exercises.homeworks;

public class Teacher extends Person{
    public String school;

    public String subjects;

    public int salary;

    public Teacher(String name, String gender, int id, String school, String subjects, int salary) {
        super(name, gender, id);
        this.school = school;
        this.subjects = subjects;
        this.salary = salary;
    }
}
