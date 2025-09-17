package edu.guia.solid.srp.strategy;

import static org.junit.jupiter.api.Assertions.*;

import edu.guia.solid.srp.bad.BadDiscountService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SrpComparisonTest {
  @ParameterizedTest
  @CsvSource({
    "STUDENT,100,90",
    "VIP,100,85",
    "BLACK_FRIDAY,100,70",
    "FIRST_PURCHASE,100,95",
    "OTHER,100,100"
  })
  void goodAndBadProduceSameNumbersButGoodIsExtensible(String type, double total, double expected){
    // bad (anti-SRP)
    BadDiscountService bad = new BadDiscountService();
    assertEquals(expected, bad.calculate(type, total), 1e-6);

    // good (Strategy): pick strategy by simple mapping (simulating a factory/config)
    DiscountStrategy strategy = switch(type){
      case "STUDENT" -> new StudentDiscount();
      case "VIP" -> new VipDiscount();
      case "BLACK_FRIDAY" -> new BlackFridayDiscount();
      case "FIRST_PURCHASE" -> new FirstPurchaseDiscount();
      default -> new NoDiscount();
    };
    DiscountCalculator calc = new DiscountCalculator(strategy);
    assertEquals(expected, calc.calculate(total), 1e-6);
  }
}