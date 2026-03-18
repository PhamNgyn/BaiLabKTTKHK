package src.designpattern;

import src.designpattern.state.*;
import src.designpattern.strategy.*;
import src.designpattern.decorator.*;

public class Main {

    public static void main(String[] args) {

        // State Pattern
        Order order = new Order();
        order.process();
        order.process();
        order.process();

        // Strategy Pattern
        ShippingService service = new ShippingService();
        service.setStrategy(new ExpressShipping());
        service.shipOrder();

        // Decorator Pattern
        OrderComponent orderCost = new BasicOrder();
        orderCost = new GiftWrap(orderCost);
        orderCost = new Insurance(orderCost);

        System.out.println("Total cost: " + orderCost.getCost());
    }
}