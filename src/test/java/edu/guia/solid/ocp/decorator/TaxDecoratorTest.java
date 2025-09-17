package edu.guia.solid.ocp.decorator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaxDecoratorTest {
  @Test
  void stackingTaxesProducesExpectedSum() {
    Budget b = new Budget(1000);
    Tax tax = new ISS(new ICMS(new ServiceFee(new ZeroTax())));
    double expected = (0.06*1000) + (0.10*1000) + 5.0;
    assertEquals(expected, tax.calculate(b), 1e-6);
  }
  @Test
  void baseCaseZeroTaxIsNeutral() {
    Budget b = new Budget(500);
    assertEquals(0.0, new ZeroTax().calculate(b), 1e-9);
  }
}