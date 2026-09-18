package service;
import java.util.ArrayList;
import java.util.Stack;
import model.Emergency;
import enums.EmergencyStatus;
import exception.EmergencyNotFoundException;
public class EmergencyTrackingService {
    private ArrayList<Emergency> emergencies;
    private Stack<Emergency> recentEmergencies;
    public EmergencyTrackingService() {
        emergencies = new ArrayList<>();
        recentEmergencies = new Stack<>();
    }
    public void addEmergency(Emergency emergency) {
        emergencies.add(emergency);
        recentEmergencies.push(emergency);
        System.out.println("Emergency "+ emergency.getEmergencyId()+ " added successfully.");
    }
    public Emergency findEmergency(int emergencyId)
            throws EmergencyNotFoundException {
        for (Emergency emergency : emergencies) {

            if (emergency.getEmergencyId()== emergencyId) {
                return emergency;
            }
        }
        throw new EmergencyNotFoundException("Emergency ID " + emergencyId+ " was not found.");
    }
    public void updateEmergencyStatus(int emergencyId, EmergencyStatus newStatus)
            throws EmergencyNotFoundException {
        Emergency emergency =findEmergency(emergencyId);
        emergency.updateStatus(newStatus);
        System.out.println("Emergency "+ emergencyId+ " status updated to "+ newStatus);
    }
    public void displayAllEmergencies() {
        System.out.println("\n--------- ALL EMERGENCIES ---------");
        for (Emergency emergency : emergencies) {
            emergency.displayEmergency();
        }
    }
    public void displayLatestEmergency() {
        if (!recentEmergencies.isEmpty()) {
            Emergency latest =recentEmergencies.peek();
            System.out.println("\nLatest Emergency: "+ latest.getEmergencyId());
        }
    }
    public void removeLatestEmergency() {
        if (!recentEmergencies.isEmpty()) {
            Emergency removed = recentEmergencies.pop();
            System.out.println("Removed Emergency: "+ removed.getEmergencyId() );
        }
    }
}