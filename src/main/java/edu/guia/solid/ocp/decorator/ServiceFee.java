package edu.guia.solid.ocp.decorator;

public class ServiceFee extends TaxDecorator {
    public ServiceFee(Tax next) {
        super(next);
    }

    public double calculate(Budget b) {
        return 5.0 + calculateOther(b);
    }
}
