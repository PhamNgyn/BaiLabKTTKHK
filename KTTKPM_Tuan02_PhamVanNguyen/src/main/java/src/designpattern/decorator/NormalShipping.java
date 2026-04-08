package src.designpattern.decorator;

public class NormalShipping implements ShippingStrategy {

    public void ship() {
        System.out.println("Shipping with normal delivery");
    }
}
