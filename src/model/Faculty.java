package model;
public class Faculty extends User {
    private String department;
    public Faculty(int userId, String name, String email, String department) {
        super(userId, name, email);
        this.department = department;
    }
    @Override
    public void displayUser() {
        System.out.println("\n--------FACULTY --------");
        super.displayUser();
        System.out.println("Department : " + department);
        System.out.println("--------------------------");
    }
}