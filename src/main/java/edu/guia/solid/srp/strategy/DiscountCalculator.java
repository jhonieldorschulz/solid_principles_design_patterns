package edu.guia.solid.srp.strategy;

public class DiscountCalculator {
    private final DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double total) {
        return strategy.apply(total);
    }
}
