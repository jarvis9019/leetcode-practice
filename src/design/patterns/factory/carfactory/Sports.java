package design.patterns.factory.carfactory;

public class Sports implements Car{
    @Override
    public void assemble() {
        System.out.println("Sports car is being assembled");
    }
}
