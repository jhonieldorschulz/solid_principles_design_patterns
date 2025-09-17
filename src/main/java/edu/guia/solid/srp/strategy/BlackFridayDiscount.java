package edu.guia.solid.srp.strategy;

public class BlackFridayDiscount implements DiscountStrategy {
    public double apply(double t) {
        return t * 0.70;
    }
}
