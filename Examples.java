/*---------------------------------------------
isPrime metotunun unit testinin JUnit kullanılarak
test edilmesi
----------------------------------------------*/
class IsPrimeTest {
  @Test
  @Disabled("That test takes so much time")
  void givenValue_whenHighPrime_thenTrue()
  {
    long input = 6584583408148485263L;

    assertTrue(NumberUtil.isPrime(input));
  }
  @Test
  void givenValue_whenUniqueEvenPrime_thenTrue()
  {
    long input = 2;

    assertTrue(NumberUtil.isPrime(input));
  }  
  @Disabled("It can take too much time in some computers")
  @ParameterizedTest
  @ValueSource(longs = {6584583408148485263L, 6245098347044246839L, 4434895834573449257L, 5697859706174583067L})
  void Test(long val)
  {
      assertTrue(NumberUtil.isPrime(val));
  }  
}
/*-----------------------------------------------
StopWatch Sınıfı ve Test kodu
-----------------------------------------------*/
package org.csystem.diagnostic;

public class StopWatch {
  private long m_start;
  private long m_stop;
  
  public StopWatch()
  {
    
  }

  public static StopWatch create()
  {
    return new StopWatch();
  }
  
  public static StopWatch createStarted()
  {
    return (new StopWatch()).start();
  }

  public StopWatch start()
  {
    m_start = System.nanoTime();
    return this;
  }

  public StopWatch stop()
  {
    m_stop = System.nanoTime();
    return this;
  }
  
  public StopWatch reset()
  {
    m_start = m_stop = 0;
    return this;
  }

  public long elapsedTime(TimeUnit timeUnit)
  {
    return timeUnit.convert(m_stop - m_start, TimeUnit.NANOSECONDS);
  }  
}

/*---------------------------------------------
BigInteger ve BigDecimal sınıfları
----------------------------------------------*/
