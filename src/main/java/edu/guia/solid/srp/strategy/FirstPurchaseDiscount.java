package edu.guia.solid.srp.strategy;

public class FirstPurchaseDiscount implements DiscountStrategy {
    public double apply(double t) {
        return t * 0.95;
    }
}
