package design.patterns.Decorator;

public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Crream";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+10.0;
    }
}
