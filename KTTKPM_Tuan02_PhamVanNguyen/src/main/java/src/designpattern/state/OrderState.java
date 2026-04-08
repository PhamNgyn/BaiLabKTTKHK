package src.designpattern.state;

import src.designpattern.state.Order;

public interface OrderState {
    void handle(Order order);
}
