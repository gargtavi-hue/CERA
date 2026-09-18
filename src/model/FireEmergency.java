package model;
import enums.EmergencyType;
import enums.Severity;
public class FireEmergency extends Emergency {
    private boolean evacuationRequired;
    public FireEmergency(int emergencyId,String location,Severity severity,String description, boolean evacuationRequired) {
        super(emergencyId, EmergencyType.FIRE,location,severity,description);
        this.evacuationRequired = evacuationRequired;
    }
    @Override
    public void handleEmergency() {
        System.out.println("Fire response team dispatched.");
        if (evacuationRequired) {
            System.out.println("Campus evacuation is required.");
        }
    }
}