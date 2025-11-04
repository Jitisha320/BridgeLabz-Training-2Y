interface VehicleDashboard {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery status not available.");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 80 km/h"); }
    public void displayBattery() { System.out.println("Battery: 85%"); }
}

class PetrolCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 70 km/h"); }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard ev = new ElectricCar();
        VehicleDashboard petrol = new PetrolCar();
        ev.displaySpeed();
        ev.displayBattery();
        petrol.displaySpeed();
        petrol.displayBattery();
    }
}