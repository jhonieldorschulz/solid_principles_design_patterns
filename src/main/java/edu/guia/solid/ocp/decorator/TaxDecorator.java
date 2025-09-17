package edu.guia.solid.ocp.decorator;

public abstract class TaxDecorator implements Tax {
    protected final Tax next;

    protected TaxDecorator(Tax next) {
        this.next = next;
    }

    protected double calculateOther(Budget b) {
        return next == null ? 0 : next.calculate(b);
    }
}
