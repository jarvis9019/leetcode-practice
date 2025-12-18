package design.patterns.Decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return "Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+5.0;
    }
}
