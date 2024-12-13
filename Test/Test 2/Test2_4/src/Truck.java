import java.util.LinkedList;

public class Truck extends Vehicle {
    private LinkedList<Car> cars = new LinkedList<>();

    public Truck(String registrationNumber, double vehicleWeight) {
        super(registrationNumber, vehicleWeight);
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public double getTotalWeight() {
        double totalWeight = getVehicleWeight();
        for (Car car : cars) {
            totalWeight += car.getTotalWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        String result = "Truck: " + super.toString() + "\n\t(";
        for (Car car : cars) {
            result += car.toString() + ", ";
        }
        result = result.substring(0, result.length() - 2);
        result += ")";
        return result;
    }

    public static void main(String[] args) {
        Car car1 = new Car("ABC123", 1000, 100);
        Car car2 = new Car("DEF456", 2000, 200);
        Truck truck1 = new Truck("GHI789", 5000);
        truck1.addCar(car1);
        truck1.addCar(car2);
        System.out.println(truck1);
    }
}
