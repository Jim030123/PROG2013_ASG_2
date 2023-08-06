class Vehicle {
    private String vehicleNumber;
    private String manufacturer;
    private String model;
    private double rentalRatePerDay;

    public Vehicle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // Getters and setters for attributes


   public String getVehicleNumber() {
       return vehicleNumber;
   }
   public void setVehicleNumber(String vehicleNumber) {
       this.vehicleNumber = vehicleNumber;
   }

   public String getManufacturer() {
       return manufacturer;
   }
   public void setManufacturer(String manufacturer) {
       this.manufacturer = manufacturer;
   }

   public String getModel() {
       return model;
   }

   public void setModel(String model) {
       this.model = model;
   }

   public double getRentalRatePerDay() {
       return rentalRatePerDay;
   }

   public void setRentalRatePerDay(double rentalRatePerDay) {
       this.rentalRatePerDay = rentalRatePerDay;
   }
    
    public double calculateRentalCost(int days) {
        return rentalRatePerDay * days;
    }

    
}