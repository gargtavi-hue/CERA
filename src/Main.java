import model.*;
import enums.*;
import service.*;
import exception.*;
import thread.*;

public class Main {
    public static void main(String[] args) {
        java.io.File reportFile = new java.io.File("emergency_report.txt");

if (reportFile.exists()) {
    reportFile.delete();
}
        Emergency medicalEmergency =new MedicalEmergency(101,"AB1 - Room 204",Severity.HIGH,"Student injured","Ambulance");
        Emergency fireEmergency =new FireEmergency(102,"Library - Ground Floor",Severity.CRITICAL,"Smoke detected",true);
        Emergency securityEmergency =new SecurityEmergency(103,"Main Gate",Severity.HIGH,"Unauthorized entry detected","HIGH");
        medicalEmergency.displayEmergency();
        fireEmergency.displayEmergency();
        securityEmergency.displayEmergency();
        System.out.println("\n--------- RESPONSE ----------");
        medicalEmergency.handleEmergency();
        fireEmergency.handleEmergency();
        securityEmergency.handleEmergency();
        MedicalResponder responder =new MedicalResponder(201,"Dr. Ankit", "ankit@vit.ac.in","Emergency Medicine");
        FireResponder fireResponder =new FireResponder(202,"Rohit","rohit@vit.ac.in");
        SecurityResponder securityResponder =new SecurityResponder(203,"Arjun","arjun@vit.ac.in");
        responder.displayUser();
        responder.respond();
        responder.sendAlert("Medical emergency reported at AB1.");
        ResourceManager manager =new ResourceManager();
        Resource ambulance =new Resource(301,"Campus Ambulance",ResourceType.AMBULANCE);
        Resource firstAid =new Resource(302,"First Aid Kit",ResourceType.FIRST_AID_KIT);
        Resource fireExtinguisher =new Resource(303,"Fire Extinguisher", ResourceType.FIRE_EXTINGUISHER);
        Resource securityVehicle =new Resource(304,"Campus Security Vehicle",ResourceType.SECURITY_VEHICLE);
        manager.addResource(ambulance);
        manager.addResource(firstAid);
        manager.addResource(fireExtinguisher);
        manager.addResource(securityVehicle);
        manager.displayAllResources();
        try {
            manager.allocateResource(ResourceType.AMBULANCE);
            manager.allocateResource(ResourceType.AMBULANCE);
        }
        catch (ResourceUnavailableException e) {
            System.out.println("\nERROR: " + e.getMessage() );
        }
        manager.displayAllResources();
        manager.releaseResource(301);
        manager.displayAllResources();
        EmergencyPriorityService priorityService =new EmergencyPriorityService();
        System.out.println("\n---------- EMERGENCY PRIORITY ----------");
        priorityService.displayPriority(medicalEmergency);
        priorityService.displayPriority(fireEmergency);
        priorityService.displayPriority(securityEmergency);
        EmergencyTrackingService trackingService =new EmergencyTrackingService();
        UserManagementService userService =new UserManagementService();
        System.out.println("\n------- USER MANAGEMENT ---------");
        User student =new Student(1,"Tavishi","tavishi@vit.ac.in","CSE AI-ML");
        User faculty =new Faculty(2,"Dr. Sharma","sharma@vit.ac.in","Computer Science");
        User admin =new Admin(3,"Campus Admin","admin@vit.ac.in","Emergency Management");
        userService.addUser(student);
        userService.addUser(faculty);
        userService.addUser(admin);
        userService.addUser(responder);
        userService.addUser(fireResponder);
        userService.addUser(securityResponder);
        userService.displayAllUsers();
        userService.identifyUserType(student);
        userService.identifyUserType(faculty);
        userService.identifyUserType(admin);
        userService.identifyUserType(responder);

        EmergencyAssignmentService assignmentService =new EmergencyAssignmentService();
        System.out.println("\n--------- RESPONDER ASSIGNMENT -----------");
        assignmentService.addResponder(responder);
        assignmentService.addResponder(fireResponder);
        assignmentService.addResponder(securityResponder);
        assignmentService.assignResponder(medicalEmergency);
        assignmentService.assignResponder(fireEmergency);
        assignmentService.assignResponder(securityEmergency);
        
        System.out.println("\n------- MULTITHREADING --------");
        EmergencyProcessingThread thread1 =new EmergencyProcessingThread(medicalEmergency,manager);
        EmergencyProcessingThread thread2 =new EmergencyProcessingThread(fireEmergency,manager);
        EmergencyProcessingThread thread3 =new EmergencyProcessingThread(securityEmergency,manager);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            }
            catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
            System.out.println("\nAll emergency threads completed.");

        System.out.println("\n---------- EMERGENCY TRACKING --------");
        trackingService.addEmergency(medicalEmergency);
        trackingService.addEmergency(fireEmergency);
        trackingService.addEmergency(securityEmergency);
        trackingService.displayLatestEmergency();
        try {
            trackingService.updateEmergencyStatus(101,EmergencyStatus.ASSIGNED);
            trackingService.updateEmergencyStatus(101,EmergencyStatus.IN_PROGRESS);
            trackingService.updateEmergencyStatus(101,EmergencyStatus.RESOLVED);
            trackingService.updateEmergencyStatus(999,EmergencyStatus.RESOLVED);
        }
        catch (EmergencyNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        trackingService.displayAllEmergencies();

        System.out.println("\n-------- FILE I/O --------");
        EmergencyReportService reportService =new EmergencyReportService();
        reportService.saveReport(medicalEmergency);
        reportService.saveReport(fireEmergency);
        reportService.saveReport(securityEmergency);
        reportService.readReports();

        System.out.println("\n-------- CERA PROGRAM COMPLETED --------");

    
        }
}