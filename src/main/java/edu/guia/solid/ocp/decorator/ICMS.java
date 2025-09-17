package edu.guia.solid.ocp.decorator;

public class ICMS extends TaxDecorator {
    public ICMS(Tax next) {
        super(next);
    }

    public double calculate(Budget b) {
        return b.value * 0.10 + calculateOther(b);
    }
}
