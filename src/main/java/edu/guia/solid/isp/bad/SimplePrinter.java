package edu.guia.solid.isp.bad;

public class SimplePrinter implements MultiFunction {
  public void print(String data){ /* imprime */ }
  public String scan(){ throw new UnsupportedOperationException("Scanner não suportado"); }
  public void fax(String number, String data){ throw new UnsupportedOperationException("Fax não suportado"); }
}