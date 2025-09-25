abstract class Vehicle {
    protected String vehicleNumber;
    protected String type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void getVehicleDetails() {
        System.out.println("Vehicle: " + type + ", Number: " + vehicleNumber);
    }
}

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Subclasses
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;  // encapsulated

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 5000;  // example fixed cost
    }

    public String getInsuranceDetails() {
        return insurancePolicyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days * 0.8;  // discount for bike
    }

    public double calculateInsurance() {
        return 2000;
    }

    public String getInsuranceDetails() {
        return insurancePolicyNumber;
    }
}

// Polymorphism example
class RentalSystemDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR123", 1000, "POL123"),
            new Bike("BIK456", 500, "POL456")
        };

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Rental Cost for 5 days: " + v.calculateRentalCost(5));
            if (v instanceof Insurable ins) {
                System.out.println("Insurance Cost: " + ins.calculateInsurance());
            }
            System.out.println();
        }
    }
}