package edu.guia.solid.srp.strategy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DiscountCalculatorTest {
  @ParameterizedTest
  @CsvSource({
    "NoDiscount,100,100",
    "StudentDiscount,100,90",
    "VipDiscount,100,85",
    "BlackFridayDiscount,100,70",
    "FirstPurchaseDiscount,100,95"
  })
  void strategiesComputeAsExpected(String className, double input, double expected) throws Exception {
    Class<?> clazz = Class.forName("edu.guia.solid.srp.strategy."+className);
    DiscountStrategy strategy = (DiscountStrategy) clazz.getDeclaredConstructor().newInstance();
    DiscountCalculator calc = new DiscountCalculator(strategy);
    assertEquals(expected, calc.calculate(input), 0.0001);
  }
  @Test
  void canSwapStrategiesWithoutChangingCalculator() {
    DiscountCalculator calc = new DiscountCalculator(new NoDiscount());
    assertEquals(200.0, calc.calculate(200.0), 1e-4);
    calc = new DiscountCalculator(new VipDiscount());
    assertEquals(170.0, calc.calculate(200.0), 1e-4);
  }
}