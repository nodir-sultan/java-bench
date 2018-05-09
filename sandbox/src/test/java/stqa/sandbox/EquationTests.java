package stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

  @Test
  public void testZero() {
    Equation e = new Equation(1, 1, 1);
    Assert.assertEquals(e.roootNumber(), 0);
  }

  @Test
  public void testOne() {
    Equation e = new Equation(1, 2, 1);
    Assert.assertEquals(e.roootNumber(), 1);
  }

  @Test
  public void testTwo() {
    Equation e = new Equation(1, 5, 6);
    Assert.assertEquals(e.roootNumber(), 2);
  }

  @Test
  public void testLinearEquation() {
    Equation e = new Equation(0, 1, 1);
    Assert.assertEquals(e.roootNumber(), 1);
  }

  @Test
  public void testConstantEquation() {
    Equation e = new Equation(0, 0, 1);
    Assert.assertEquals(e.roootNumber(), 0);
  }

  @Test
  public void testZeroEquation() {
    Equation e = new Equation(0, 0, 0);
    Assert.assertEquals(e.roootNumber(), -1);
  }

}
