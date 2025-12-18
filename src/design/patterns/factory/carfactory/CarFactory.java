package design.patterns.factory.carfactory;

public class CarFactory {
    public Car getCar(String carType){
        if(carType == null) return null;
        if(carType.equalsIgnoreCase("SUV")){
            return new SUV();
        }
        else if(carType.equalsIgnoreCase("sports")){
            return new Sports();
        }
        return null;
    }
}
