package thread;
import model.Emergency;
import model.Resource;
import service.ResourceManager;
import enums.EmergencyType;
import enums.ResourceType;
import enums.EmergencyStatus;
import exception.ResourceUnavailableException;
public class EmergencyProcessingThread extends Thread {
    private Emergency emergency;
    private ResourceManager resourceManager;
    public EmergencyProcessingThread(Emergency emergency,ResourceManager resourceManager) {
        this.emergency = emergency;
        this.resourceManager = resourceManager;
    }
    @Override
    public void run() {
        System.out.println("\nThread started for Emergency "+ emergency.getEmergencyId());
        try {
            ResourceType resourceType;
            if (emergency.getType() == EmergencyType.MEDICAL) {
                resourceType = ResourceType.AMBULANCE;
            } else if (emergency.getType() == EmergencyType.FIRE) {
                resourceType = ResourceType.FIRE_EXTINGUISHER;
            } else {
                resourceType = ResourceType.SECURITY_VEHICLE;
            }
            Resource resource =resourceManager.allocateResource(resourceType);
            emergency.updateStatus(EmergencyStatus.IN_PROGRESS);
            System.out.println("Emergency "+ emergency.getEmergencyId()+ " is being processed.");
            Thread.sleep(1000);
            resourceManager.releaseResource(resource.getResourceId());
            emergency.updateStatus(EmergencyStatus.RESOLVED);
            System.out.println("Emergency "+ emergency.getEmergencyId()+ " resolved.");
        }
        catch (ResourceUnavailableException e) {
            System.out.println("Emergency "+ emergency.getEmergencyId()+ ": "+ e.getMessage());
            }
        catch (InterruptedException e) {
            System.out.println("Emergency processing interrupted." );
        }
    }
}