


import java.util.*;

class Laptop {
    private String model;
    private int ram;
    private int storageCapacity;
    private String os;
    private String color;

    public Laptop(String model, int ram, int storageCapacity, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a set of laptops
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Model1", 8, 512, "Windows", "Black"));
        laptops.add(new Laptop("Model2", 16, 1024, "MacOS", "Gray"));
        // Add more laptops as needed

        // Prompt the user for filtering criteria
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filter = new HashMap<>();

        System.out.println("Enter the number corresponding to the criteria:");
        System.out.println("1 - RAM");
        System.out.println("2 - Storage Capacity");
        System.out.println("3 - Operating System");
        System.out.println("4 - Color");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the minimum RAM value:");
                int minRam = scanner.nextInt();
                filter.put("RAM", minRam);
                break;
            case 2:
                System.out.println("Enter the minimum storage capacity:");
                int minStorageCapacity = scanner.nextInt();
                filter.put("StorageCapacity", minStorageCapacity);
                break;
            case 3:
                System.out.println("Enter the operating system:");
                String os = scanner.next();
                filter.put("OS", os);
                break;
            case 4:
                System.out.println("Enter the color:");
                String color = scanner.next();
                filter.put("Color", color);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Filter and display results
        Set<Laptop> results = filterLaptops(laptops, filter);
        displayResults(results);


    }

    private static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, Object> filter) {
        Set<Laptop> results = new HashSet<>(laptops);

        for (Map.Entry<String, Object> entry : filter.entrySet()) {
            String criterion = entry.getKey();
            Object value = entry.getValue();

            switch (criterion) {
                case "RAM":
                    results.removeIf(laptop -> laptop.getRam() < (int) value);
                    break;
                case "StorageCapacity":
                    results.removeIf(laptop -> laptop.getStorageCapacity() < (int) value);
                    break;
                case "OS":
                    results.removeIf(laptop -> !laptop.getOs().equalsIgnoreCase((String) value));
                    break;
                case "Color":
                    results.removeIf(laptop -> !laptop.getColor().equalsIgnoreCase((String) value));
                    break;
                default:
                    System.out.println("Unknown criterion: " + criterion);
            }
        }

        return results;
    }

    private static void displayResults(Set<Laptop> results) {
        if (results.isEmpty()) {
            System.out.println("No laptops found based on the specified criteria.");
        } else {
            System.out.println("Search results:");
            for (Laptop laptop : results) {
                System.out.println("Model: " + laptop.getModel() +
                        ", RAM: " + laptop.getRam() +
                        ", Storage Capacity: " + laptop.getStorageCapacity() +
                        ", OS: " + laptop.getOs() +
                        ", Color: " + laptop.getColor());
            }
        }
    }
}



