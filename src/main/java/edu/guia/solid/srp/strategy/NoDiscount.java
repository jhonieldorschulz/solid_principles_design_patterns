package edu.guia.solid.srp.strategy;

public class NoDiscount implements DiscountStrategy {
    public double apply(double t) {
        return t;
    }
}
