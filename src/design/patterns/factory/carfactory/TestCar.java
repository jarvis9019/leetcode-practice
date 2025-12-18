package design.patterns.factory.carfactory;

public class TestCar {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.getCar("sports");
        car.assemble();

    }
}
