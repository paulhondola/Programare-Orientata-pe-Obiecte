abstract public class Vehicle {
    private String registrationNumber;
    private double vehicleWeight;
    abstract public double getTotalWeight(); // Its own weight plus the weight of cargo carried

    public Vehicle(String registrationNumber, double vehicleWeight) {
        this.registrationNumber = registrationNumber;
        this.vehicleWeight = vehicleWeight;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getVehicleWeight() {
        return vehicleWeight;
    }

    @Override
    public String toString() {
        return "Registration Number: " + registrationNumber + ", Vehicle Weight: " + getVehicleWeight();
    }
}
