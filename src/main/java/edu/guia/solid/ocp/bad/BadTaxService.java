package edu.guia.solid.ocp.bad;

import edu.guia.solid.ocp.decorator.Budget;

import java.util.List;

public class BadTaxService {
  public double total(Budget b, List<String> taxes){
    double sum = 0.0;
    for(String t: taxes){
      switch (t){
        case "ICMS" -> sum += b.value * 0.10;
        case "ISS"  -> sum += b.value * 0.06;
        case "FEE"  -> sum += 5.0;
        default -> {}
      }
    }
    return sum;
  }
}