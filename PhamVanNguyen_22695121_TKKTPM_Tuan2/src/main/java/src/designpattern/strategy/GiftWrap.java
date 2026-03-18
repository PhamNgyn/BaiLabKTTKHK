package src.designpattern.strategy;

public class GiftWrap extends OrderDecorator {

    public GiftWrap(OrderComponent order) {
        super(order);
    }

    public double getCost() {
        return super.getCost() + 10;
    }
}
