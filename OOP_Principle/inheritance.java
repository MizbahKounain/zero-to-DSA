package OOP_Principle;

class Vehicle {
    String brand = "Toyota";

    public void start() {
        System.out.println("Vehicle is starting......");
    }

    public void stop() {
        System.out.println("Vehicle is stopping......");
    }
}

class Car extends Vehicle {
    int door = 4;

    public void openSunRoof() {
        System.out.println("This car has a sunroof to open !!!");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("The brand is " + car.brand);
        System.out.println("The car has " + car.door + " doors");
        car.start();
        car.openSunRoof();
        car.stop();
    }
}

/*
 * Example: Vehicle
 * 1. Every vehicle has its own features
 * 2. Car and bike is also a vehicle that can have common properties of a
 * vehicle
 * 3. Each vehicle like car and bike can also have their own features that is to
 * be implemented
 */
