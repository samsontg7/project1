public class Teacher extends Person {
    String specialization;

    public Teacher(String name, int id, int age, boolean parent_permission, String specialization) {
        super(name, id, age, parent_permission);
        this.specialization = specialization;
    }
    @Override
    public boolean can_use_services() {
        return true;
    }
}