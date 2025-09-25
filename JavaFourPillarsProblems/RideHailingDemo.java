abstract class Vehicle {
    // Encapsulated fields
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters and setters (encapsulation)
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void setRatePerKm(double ratePerKm) {
        if(ratePerKm > 0) this.ratePerKm = ratePerKm;
    }

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName +
                    ", Rate/Km: " + ratePerKm);
    }

    // Abstract method
    public abstract double calculateFare(double distance);
}

// Interface for GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Subclass: Car
class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // standard fare
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

// Subclass: Bike
class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9; // 10% discount on fare
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

// Subclass: Auto
class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; // 20% discount on fare
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

// Main class to demonstrate polymorphism
public class RideHailingDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("CAR001", "Alice", 20);
        vehicles[1] = new Bike("BIKE001", "Bob", 15);
        vehicles[2] = new Auto("AUTO001", "Charlie", 10);

        double distance = 12; // in km

        // Polymorphic fare calculation
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));

            if (v instanceof GPS gps) {
                gps.updateLocation("Downtown");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            System.out.println("---------------------------");
        }
    }
}