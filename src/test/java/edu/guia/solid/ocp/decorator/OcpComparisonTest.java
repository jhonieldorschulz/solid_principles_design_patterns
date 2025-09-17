package edu.guia.solid.ocp.decorator;

import static org.junit.jupiter.api.Assertions.*;

import edu.guia.solid.ocp.bad.BadTaxService;
import org.junit.jupiter.api.Test;
import java.util.List;

public class OcpComparisonTest {
  @Test
  void badSwitchVsGoodDecorator(){
    Budget b = new Budget(1000);
    // bad
    double bad = new BadTaxService().total(b, List.of("ICMS","ISS","FEE"));
    // good
    Tax good = new ISS(new ICMS(new ServiceFee(new ZeroTax())));
    assertEquals(good.calculate(b), bad, 1e-6);
  }
}