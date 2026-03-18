package src.designpattern.state;

import src.designpattern.state.DeliveredState;
import src.designpattern.state.Order;
import src.designpattern.state.OrderState;

public class ProcessingState implements OrderState {

    public void handle(Order order) {
        System.out.println("Packing and shipping...");
        order.setState(new DeliveredState());
    }
}
