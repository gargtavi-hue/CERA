package service;
import java.util.ArrayList;
import model.User;
import model.Student;
import model.Faculty;
import model.Admin;
import model.Responder;
public class UserManagementService {
    private ArrayList<User> users;
    public UserManagementService() {
        users = new ArrayList<>();
    }
    public void addUser(User user) {
        users.add(user);
        System.out.println("User " + user.getUserId()+ " added successfully.");
    }
    public User findUser(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
    public void displayAllUsers() {
        System.out.println("\n--------- ALL USERS ----------");
        for (User user : users) {
            user.displayUser();
        }
    }
    public void identifyUserType(User user) {
        System.out.println("\nChecking user type...");
    if (user instanceof Student) {
        System.out.println("Role: Student" );
    }
    else if (user instanceof Faculty) {
        System.out.println("Role: Faculty");
    }
    else if (user instanceof Admin) {
        System.out.println("Role: Admin");
    }
    else if (user instanceof Responder) {
        System.out.println("Role: Responder");
    }
}
}