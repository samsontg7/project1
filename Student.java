
public class Student extends Person {
    String classroom;

    public Student(String name, int id, int age, boolean parent_permission, String classroom) {
        super(name, age, id, parent_permission);
        this.classroom = classroom;
    }
}


