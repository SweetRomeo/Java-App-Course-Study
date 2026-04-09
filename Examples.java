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
}

/*---------------------------------------------
BigInteger ve BigDecimal sınıfları
----------------------------------------------*/
