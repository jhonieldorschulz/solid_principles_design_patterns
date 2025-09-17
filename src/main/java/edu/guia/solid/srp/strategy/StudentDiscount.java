package edu.guia.solid.srp.strategy;

public class StudentDiscount implements DiscountStrategy {
    public double apply(double t) {
        return t * 0.90;
    }
}
