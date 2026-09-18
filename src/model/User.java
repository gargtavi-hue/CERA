package model;
public class User {
    protected int userId;
    protected String name;
    protected String email;
    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }
    public int getUserId() {
         return userId;
    }
    public String getName() {
        return name;
    }
    public void displayUser() {
        System.out.println("User ID : " + userId);
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
    }
}