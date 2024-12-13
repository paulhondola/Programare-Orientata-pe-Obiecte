public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("ABC123", 4, 0.3);
        Car car2 = new Car("DEF456", 5, 0.25);
        Car car3 = new Car("GHI789", 4.5, 0.15);

        Truck truck1 = new Truck("JKL012", 10);
        truck1.addCar(car1);
        truck1.addCar(car2);

        Ferry ferry = new Ferry(20);
        ferry.addVehicle(truck1);
        ferry.addVehicle(car3);

        System.out.println(ferry);
    }
}