public class isPrime {
  public static boolean isPrime(int num) {
    if(num <= 1) return false;
    if(num == 2) return true;
    if(num % 2 == 0) return false;
    
    