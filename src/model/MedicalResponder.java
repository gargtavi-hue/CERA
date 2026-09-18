package model;
import interfacepackage.Alertable;
public class MedicalResponder extends Responder
        implements Alertable {
    private String specialization;
    public MedicalResponder(int responderId,String name,String email, String specialization) {
        super(responderId,name,email);
        this.specialization = specialization;
    }
    @Override
    public void respond() {
        System.out.println(name + " is responding with medical assistance.");
    }
    @Override
    public void sendAlert(String message) {
        System.out.println("MEDICAL ALERT: " + message);
    }
    @Override
    public void displayUser() {
        System.out.println("\n------- MEDICAL RESPONDER -------");
        super.displayUser();
        System.out.println("Specialization : " + specialization);
        System.out.println("-----------------------------------");
    }
}