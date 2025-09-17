package edu.guia.solid.isp.adapter;

import static org.junit.jupiter.api.Assertions.*;

import edu.guia.solid.isp.bad.MultiFunction;
import edu.guia.solid.isp.bad.SimplePrinter;
import org.junit.jupiter.api.Test;

public class IspComparisonTest {
  @Test
  void badInterfacesForceUnsupportedOperations(){
    MultiFunction p = new SimplePrinter();
    assertThrows(UnsupportedOperationException.class, () -> p.scan());
  }
  @Test
  void goodInterfacesAreFineGrained(){
    Printer p = new MultiFunctionPrinter();
    p.print("ok");
    Scanner s = new MultiFunctionPrinter();
    assertEquals("<scan>", s.scan());
  }
}