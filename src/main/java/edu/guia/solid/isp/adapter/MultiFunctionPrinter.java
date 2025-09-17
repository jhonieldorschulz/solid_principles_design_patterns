package edu.guia.solid.isp.adapter;

public class MultiFunctionPrinter implements Printer, Scanner {
  public void print(String data){ /* impressão real omitida */ }
  public String scan(){ return "<scan>"; }
}

