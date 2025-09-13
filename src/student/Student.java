package student;

public class Student {
    // declaring variables/properties/fields
    int id;
    String name;
    String faculty;
    String department;
    // constructor
    public Student (int id, String name, String faculty, String department) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.department = department;
    }

    // method(s)
    public void showDetails() {
        System.out.println("id: " + this.id);
        System.out.println("name: " + this.name);
        System.out.println("faculty: " + this.faculty);
        System.out.println("department: " + this.department);
    }
}
