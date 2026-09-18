package model;
import enums.EmergencyType;
import enums.Severity;
public class MedicalEmergency extends Emergency {
    private String medicalRequirement;
    public MedicalEmergency(int emergencyId, String location, Severity severity,String description,String medicalRequirement) {

        super(emergencyId,EmergencyType.MEDICAL,location,severity,description);
        this.medicalRequirement = medicalRequirement;
    }
    @Override
    public void handleEmergency() {
        System.out.println("Medical team dispatched for: " + medicalRequirement);
    }
}