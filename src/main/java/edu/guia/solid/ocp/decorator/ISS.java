package edu.guia.solid.ocp.decorator;

public class ISS extends TaxDecorator {
    public ISS(Tax next) {
        super(next);
    }

    public double calculate(Budget b) {
        return b.value * 0.06 + calculateOther(b);
    }
}
