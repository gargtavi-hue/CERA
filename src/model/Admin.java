package model;
public class Admin extends User {
    private String department;
    public Admin(int userId,String name,String email,String department) {
        super(userId, name, email);
        this.department = department;
    }
    @Override
    public void displayUser() {
        System.out.println("\n------- ADMIN ----------");
        super.displayUser();
        System.out.println("Department : " + department);
        System.out.println("----------------------------");
    }
}