package src.designpattern.strategy;
public abstract class OrderDecorator implements OrderComponent {

    protected OrderComponent order;

    public OrderDecorator(OrderComponent order) {
        this.order = order;
    }

    public double getCost() {
        return order.getCost();
    }
}
