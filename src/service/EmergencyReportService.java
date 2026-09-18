package service;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import model.Emergency;
public class EmergencyReportService {
    private final String fileName = "emergency_report.txt";
    public void saveReport(Emergency emergency) {
        try {
            FileWriter writer =new FileWriter(fileName, true);
            writer.write("\n------- EMERGENCY REPORT --------\n");
            writer.write("Emergency ID : " + emergency.getEmergencyId() + "\n");
            writer.write("Type         : "+ emergency.getType()+ "\n");
            writer.write("Severity     : "+ emergency.getSeverity()+ "\n");
            writer.write("Status       : " + emergency.getStatus()+ "\n");
            writer.write("----------------------------------\n" );
            writer.close();
            System.out.println("Emergency report saved successfully.");
        }
        catch (IOException e) {
            System.out.println("Error while saving report: "+ e.getMessage());
        }
    }
    public void readReports() {
        try {
            FileReader reader =new FileReader(fileName);
            int character;
            System.out.println("\n------- SAVED REPORTS -------");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character );
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("Error while reading reports: "+ e.getMessage());
        }
    }
}