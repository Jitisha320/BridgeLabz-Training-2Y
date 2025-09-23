public class CarRentalDemo {
    static class CarRental {
        String customerName;
        String carModel;
        int rentalDays;
        double costPerDay = 1000;

        CarRental(String customerName, String carModel, int rentalDays) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
        }

        double calculateTotalCost() {
            return rentalDays * costPerDay;
        }

        void displayRental() {
            System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: $" + calculateTotalCost());
        }
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Deepti", "Honda City", 5);
        CarRental rental2 = new CarRental("Ravi", "Toyota Corolla", 3);

        rental1.displayRental();
        rental2.displayRental();
    }
}