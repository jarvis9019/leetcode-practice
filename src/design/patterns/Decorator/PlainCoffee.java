package design.patterns.Decorator;

public class PlainCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
