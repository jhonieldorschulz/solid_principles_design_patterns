package edu.guia.solid.isp.adapter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdapterPrinterTest {
  @Test
  void adapterMakesLegacyCompatible() {
    OldAllInOneAdapter adapter = new OldAllInOneAdapter(new OldAllInOne());
    adapter.print("invoice-123");
    assertEquals("LEGACY", adapter.scan());
  }
  @Test
  void multiFunctionPrinterConformsToInterfaces() {
    Printer p = new MultiFunctionPrinter();
    Scanner s = (Scanner) p;
    p.print("ok");
    assertEquals("<scan>", s.scan());
  }
}