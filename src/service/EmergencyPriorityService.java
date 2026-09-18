package service;
import model.Emergency;
import enums.Severity;
import enums.EmergencyType;

public class EmergencyPriorityService {
    public int calculatePriority(Severity severity) {
        switch (severity) {
            case CRITICAL:
                return 1;
            case HIGH:
                return 2;
            case MEDIUM:
                return 3;
            case LOW:
                return 4;
            default:
                return 5;
        }
    }
    public int calculatePriority(Severity severity,EmergencyType type) {
        int priority = calculatePriority(severity);
        if (type == EmergencyType.MEDICAL && priority > 1) {
            priority--;
        }
         return priority;
    }
    public void displayPriority(Emergency emergency) {
        int priority = calculatePriority(emergency.getSeverity(),emergency.getType());
        System.out.println("\nEmergency ID : "+ emergency.getEmergencyId());
        System.out.println("Emergency Type : "+ emergency.getType());
        System.out.println("Severity : "+ emergency.getSeverity());
        System.out.println("Priority Level : "+ priority);
    }
}