package model;
public class SecurityResponder extends Responder {
    public SecurityResponder(int responderId,String name,String email) {
        super(responderId, name, email);
    }
    @Override
    public void respond() {
        System.out.println(name + " is responding to the security emergency.");
    }
}