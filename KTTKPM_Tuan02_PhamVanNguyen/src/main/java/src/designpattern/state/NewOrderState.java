package src.designpattern.state;

public class NewOrderState implements OrderState {

    public void handle(Order order) {
        System.out.println("Checking order information...");
        order.setState(new ProcessingState());
    }
}
