class Car extends Vehicle {
    private int numberOfDoors;

    protected Car(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, int numberOfDoors) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.numberOfDoors = numberOfDoors;


    }

    // Getters and setters for attributes

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = super.calculateRentalCost(days);
        if (numberOfDoors > 2) {
            cost += 35 * days;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Car - " + super.toString() + ", Doors: " + numberOfDoors;
    }
}