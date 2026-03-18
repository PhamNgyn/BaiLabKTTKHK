package src.designpattern.strategy;

public class Insurance extends OrderDecorator {

    public Insurance(OrderComponent order) {
        super(order);
    }

    public double getCost() {
        return super.getCost() + 20;
    }
}
