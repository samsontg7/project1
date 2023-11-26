import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom("Math");
        Student student1 = new Student("Abel", 20, true);
        Student student2 = new Student("Nahom", 15, false);

        classroom.addStudent(student1);
        classroom.addStudent(student2);

        List<Student> students = classroom.getStudents();
        for (Student student : students) {
            System.out.println(student.getName());
        }

        Book book = new Book("hello there", " fraol");
        Person person = new Person("mahlet", 20, false);

        Rental rental = new Rental(book, person);
        System.out.println(rental.getBook().getTitle());
        System.out.println(rental.getPerson().getName());
    }
}
