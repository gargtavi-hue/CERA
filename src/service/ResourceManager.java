package service;
import java.util.Vector;
import model.Resource;
import enums.ResourceType;
import exception.ResourceUnavailableException;
import java.util.ArrayList;
public class ResourceManager {
    private ArrayList<Resource> resources;
    public ResourceManager() {
        resources = new ArrayList<>();
    }
    public void addResource(Resource resource) {
        resources.add(resource);
    }
    public synchronized Resource allocateResource(ResourceType type)
        throws ResourceUnavailableException {
            for (Resource resource : resources) {
                if (resource.getType() == type && resource.isAvailable()) {
                    resource.allocate();
                    System.out.println("\nResource allocated: "+ resource.getName());
            return resource;
        }
    }
    throw new ResourceUnavailableException("No " + type + " is currently available.");
}
            
    public void releaseResource(int resourceId) {
        for (Resource resource : resources) {
            if (resource.getResourceId() == resourceId) {
                resource.release();
                System.out.println("\nResource released: "+ resource.getName());
                return;
            }
        }
    }
    public void displayAllResources() {
        System.out.println("\n----------- ALL RESOURCES --------");
        for (Resource resource : resources) {
            resource.displayResource();
            System.out.println("-----------------------------------");
        }
    }
}