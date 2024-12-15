abstract public class AbstractVehicle implements Vehicle{
    private String registrationNumber;
    private double vehicleWeight;

    public AbstractVehicle(String registrationNumber, double vehicleWeight) {
        this.registrationNumber = registrationNumber;
        this.vehicleWeight = vehicleWeight;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public double getTotalWeight() {
        return vehicleWeight;
    }

    @Override
    public String toString() {
        return "Registration Number: " + registrationNumber + ", Vehicle Weight: " + vehicleWeight;
    }
}
