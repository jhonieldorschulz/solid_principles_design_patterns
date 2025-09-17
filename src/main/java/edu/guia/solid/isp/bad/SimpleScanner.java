package edu.guia.solid.isp.bad;

public class SimpleScanner implements MultiFunction {
  public void print(String data){ throw new UnsupportedOperationException("Printer não suportado"); }
  public String scan(){ return "<scan>"; }
  public void fax(String number, String data){ throw new UnsupportedOperationException("Fax não suportado"); }
}