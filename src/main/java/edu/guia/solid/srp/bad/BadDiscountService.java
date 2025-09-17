package edu.guia.solid.srp.bad;

public class BadDiscountService {
  public double calculate(String customerType, double total){
    if ("STUDENT".equals(customerType)) return total * 0.90;
    if ("VIP".equals(customerType)) return total * 0.85;
    if ("BLACK_FRIDAY".equals(customerType)) return total * 0.70;
    if ("FIRST_PURCHASE".equals(customerType)) return total * 0.95;
    return total;
  }
}