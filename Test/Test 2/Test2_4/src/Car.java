public class Car extends Vehicle{
    private double passengerWeight;

    public Car(String registrationNumber, double vehicleWeight, double passengerWeight) {
        super(registrationNumber, vehicleWeight);
        this.passengerWeight = passengerWeight;
    }

    @Override
    public double getTotalWeight() {
        return getVehicleWeight() + passengerWeight;
    }

    @Override
    public String toString() {
        return "Car: " + super.toString() + ", Passenger Weight: " + passengerWeight;
    }

    public static void main(String[] args) {
        Car car1 = new Car("ABC123", 1000, 100);
        System.out.println(car1);
    }
}
