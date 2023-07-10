package exercises.homeworks;

public class Person extends Object{

    public String name;

    public String gender;

    public int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, String gender, int id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }
}
