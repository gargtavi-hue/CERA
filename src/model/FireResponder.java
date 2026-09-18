package model;
public class FireResponder extends Responder {
    public FireResponder(int responderId,String name,String email) {
        super(responderId, name, email);
    }
    @Override
    public void respond() {
        System.out.println(name + " is responding to the fire emergency.");
    }
}