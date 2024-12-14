import java.util.LinkedList;
public class Ferry {
    private LinkedList<Vehicle> vehicles = new LinkedList<>();
    private double weightLimit;
    private double currentWeight;

    public Ferry(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public boolean addVehicle(Vehicle vehicle) {
        if (currentWeight + vehicle.getTotalWeight() > weightLimit)
            return false;

        currentWeight += vehicle.getTotalWeight();
        vehicles.add(vehicle);
        return true;
    }

    @Override
    public String toString() {
       return "Ferry Weight Limit: " + weightLimit + ", Current Weight: " + currentWeight + ", Vehicles " +
                "on ferry: " + vehicles;
    }

    public static void main(String[] args) {
        Ferry ferry = new Ferry(10000);
        Car car1 = new Car("ABC123", 1000, 100);
        Car car2 = new Car("DEF456", 2000, 200);
        Truck truck1 = new Truck("GHI789", 3000);
        truck1.addCar(car1);
        truck1.addCar(car2);

        Car car3 = new Car("JKL012", 1000, 100);

        ferry.addVehicle(truck1);
        ferry.addVehicle(car3);

        System.out.println(ferry);
    }
}
