package src.designpattern.state;

public class DeliveredState implements OrderState {

    public void handle(Order order) {
        System.out.println("Order delivered successfully.");
    }
}