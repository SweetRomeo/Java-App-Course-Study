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

/*---------------------------------------------
BigInteger ve BigDecimal sınıfları
----------------------------------------------*/
