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
        double totalWeight = super.getTotalWeight();
        for (Car car : cars) {
            totalWeight += car.getTotalWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString() + ", Total Weight: " + getTotalWeight() +
                ", Cars in" +
                " " +
                "truck: " + cars;
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
