abstract public class Vehicle implements Transportable{
    private String registrationNumber;
    private double vehicleWeight;

    public Vehicle(String registrationNumber, double vehicleWeight) {
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
