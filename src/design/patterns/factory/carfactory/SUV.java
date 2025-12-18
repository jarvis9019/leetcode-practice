package design.patterns.factory.carfactory;

public class SUV implements Car{
    @Override
    public void assemble() {
        System.out.println("SUV is being assembled");
    }
}
