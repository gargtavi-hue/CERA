package model;
import enums.ResourceType;
public class Resource {
    private int resourceId;
    private String name;
    private ResourceType type;
    private boolean available;
    public Resource(int resourceId, String name,ResourceType type) {
        this.resourceId = resourceId;
        this.name = name;
        this.type = type;
        this.available = true;
    }
    public int getResourceId() {
        return resourceId; }
    public String getName() {
        return name; }
    public ResourceType getType() {
        return type; }
    public boolean isAvailable() {
        return available; }
    public void allocate() {
        available = false; }
    public void release() {
        available = true; }
    public void displayResource() {
        System.out.println("Resource ID : " + resourceId );
        System.out.println("Name        : " + name );
        System.out.println("Type        : " + type);
        System.out.println("Available   : " + available);
    }
}