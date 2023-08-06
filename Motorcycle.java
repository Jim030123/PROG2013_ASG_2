class Motorcycle extends Vehicle {
    private double engineCapacity;

    protected Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay,
            double engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
    }

    // Getters and setters for attributes
    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double calculateTopSpeed() {
        return engineCapacity * 50;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = super.calculateRentalCost(days);
        if (calculateTopSpeed() >= 300) {
            cost += 150;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Motorcycle - " + super.toString() + ", Engine Capacity: " + engineCapacity;
    }
}