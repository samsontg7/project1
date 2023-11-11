public class Person {
    String name="unknown";
    int age;
    int id;
    boolean parent_permission=true;

    public Person(String  name,int id,int age,boolean parent_permission){
        this.name=name;
        this.age=age;
        this.id=id;
        this.parent_permission=parent_permission;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private boolean of_age() {
        if (age>=18)
            return true;
        else{
            return false;
        }
    }
    public boolean can_use_services() {
        if (of_age() || parent_permission)
            return true;
        else {
            return false;
        }
    }

}