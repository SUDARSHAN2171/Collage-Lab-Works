public class ExperimentNo5B {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
        sportsCar.drive();
    }
}

class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }

    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

class SportsCar extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Sports car is driving fast!");
    }
}
// create 4 class shape with method get area that returns the area create
// subclass rectangle that extends shape & add field length & breaks & override
// method getarea that returns area