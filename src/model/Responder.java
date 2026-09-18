package model;
public class Responder extends User {
    protected boolean available;
    public Responder(int userId,String name, String email) {
        super(userId, name, email);
        this.available = true;
    }
    public void respond() {
        System.out.println(name + " is responding to the emergency.");
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public void displayUser() {
        System.out.println("\n--------- RESPONDER ---------");
        super.displayUser();
        System.out.println( "Available : " + available);
        System.out.println("-------------------------------");
    }
}