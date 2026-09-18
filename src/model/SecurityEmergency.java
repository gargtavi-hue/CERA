package model;
import enums.EmergencyType;
import enums.Severity;
public class SecurityEmergency extends Emergency {
    private String securityLevel;
    public SecurityEmergency(int emergencyId,String location,Severity severity,String description,String securityLevel) {
        super(emergencyId,EmergencyType.SECURITY,location, severity,description);
        this.securityLevel = securityLevel;
    }
    @Override
    public void handleEmergency() {
        System.out.println("Security team dispatched. Security level: "+ securityLevel);
    }
}