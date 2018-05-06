package stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testarea() {
    Point point = new Point(5,20);
    Assert.assertEquals(point.distance(), 25.0);
    System.out.println(point.distance());
  }


}
