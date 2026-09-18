package model;
public class Student extends User {
    private String course;
    public Student(int userId, String name, String email, String course) {
        super(userId, name, email);
        this.course = course;
    }
    @Override
    public void displayUser() {
        System.out.println("\n------STUDENT ------");
        super.displayUser();
        System.out.println("Course  : " + course);
        System.out.println("----------------------");
    }
}