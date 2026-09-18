package service;
import java.util.ArrayList;
import model.Emergency;
import model.Responder;
import model.MedicalResponder;
import model.FireResponder;
import model.SecurityResponder;
import enums.EmergencyType;
import enums.EmergencyStatus;
public class EmergencyAssignmentService {
    private ArrayList<Responder> responders;
    public EmergencyAssignmentService() {
        responders = new ArrayList<>();
    }
    public void addResponder(Responder responder) {
        responders.add(responder);
        System.out.println( "Responder " + responder.getUserId()+ " added to assignment system.");
    }
    public Responder findAvailableResponder(
            EmergencyType emergencyType) {
        for (Responder responder : responders) {
            if (responder.isAvailable()) {
                if (emergencyType == EmergencyType.MEDICAL && responder instanceof MedicalResponder) {
                    return responder;
                }
                if (emergencyType == EmergencyType.FIRE && responder instanceof FireResponder) {
                    return responder;
                }
                if (emergencyType == EmergencyType.SECURITY&& responder instanceof SecurityResponder) {
                    return responder;
                }
            }
        }
        return null;
    }
    public void assignResponder(Emergency emergency) {
        Responder responder =findAvailableResponder(emergency.getType());
        if (responder == null) {
            System.out.println("No suitable responder available for Emergency " + emergency.getEmergencyId());
            return;
        }
        responder.setAvailable(false);
        emergency.updateStatus(EmergencyStatus.ASSIGNED);
        System.out.println("\nResponder assigned successfully.");
        System.out.println("Emergency ID : "+ emergency.getEmergencyId());
        System.out.println("Responder    : " + responder.getName() );
        responder.respond();
    }
}