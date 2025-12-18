package design.patterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription() + " : " + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " : " + coffee.getCost());

        coffee = new CreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " : " + coffee.getCost());
    }
}
