public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car("AAA0120", "Proton", "Saga", 250, 4);
        vehicles[1] = new Motorcycle("ADB2036", "Honda", "CBR500R", 60, 2.2);
        vehicles[2] = new Car("JUY5301", "Toyota", "Vios", 80, 2);
        vehicles[3] = new Motorcycle("MYH2301 ", "Honda", "Rebel 500", 20,1.5);

        int rentalDays = 1;

        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {  // Check if the vehicle is not null 
                System.out.println(vehicle);
                System.out.println("Rental Cost for " + rentalDays + " days: RM" + vehicle.calculateRentalCost(rentalDays));
                if (vehicle instanceof Motorcycle) {
                    Motorcycle motorcycle = (Motorcycle) vehicle;
                    System.out.println("Top Speed: " + motorcycle.calculateTopSpeed() + " km/h");
                }
                System.out.println("--------------------");
            }
        }
    }
}