package stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

  @Test
  public void testPrime(){
    Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
  }

  @Test
  public void testPrimeWhile(){
    Assert.assertTrue(Primes.isPrimeWhile(Integer.MAX_VALUE));
  }

  @Test
  public void testNonPrime(){
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }

  @Test(enabled = false)
  public void testLongPrime(){
    Assert.assertTrue(Primes.isPrime((long) Integer.MAX_VALUE));
  }

}
