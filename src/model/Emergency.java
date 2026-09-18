package model;
import enums.EmergencyType;
import enums.Severity;
import enums.EmergencyStatus;
public abstract class Emergency {
    protected int emergencyId;
    protected EmergencyType type;
    protected String location;
    protected Severity severity;
    protected String description;
    protected EmergencyStatus status;
    public Emergency(int emergencyId, EmergencyType type,String location, Severity severity, String description) {
        this.emergencyId = emergencyId;
        this.type = type;
        this.location = location;
        this.severity = severity;
        this.description = description;
        this.status = EmergencyStatus.REPORTED;
    }
    public abstract void handleEmergency();
    public void displayEmergency() {
        System.out.println("\n--------- EMERGENCY DETAILS ---------");
        System.out.println("Emergency ID : " + emergencyId);
        System.out.println("Type         : " + type);
        System.out.println("Location     : " + location);
        System.out.println("Severity     : " + severity);
        System.out.println("Description  : " + description);
        System.out.println("Status       : " + status);
        System.out.println("--------------------------------------");
    }
    public void updateStatus(EmergencyStatus status) {
        this.status = status;}
    public int getEmergencyId() {
        return emergencyId;}
    public EmergencyType getType() {
        return type;}
    public Severity getSeverity() {
        return severity; }
    public EmergencyStatus getStatus() {
        return status;}
}