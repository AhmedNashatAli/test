package org.test.example.calc;

import org.test.example.calc.Calculator;
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

  Calculator calculator;

  @Before
  public void setUp() {
    calculator = new Calculator();
  }

  @Test
  public void testCalculatingSingleNumber() {
    assertEquals(5, calculator.calculate("5"), 0);
  }

  // Now try adding addition such as "5 + 5"
 
  @Test
  public void testCalculatingAddition(){
      assertEquals(10, calculator.add(5,5));
  }
 
}
