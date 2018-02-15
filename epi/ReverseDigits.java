package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;

public class ReverseDigits {
  @EpiTest(testfile = "reverse_digits.tsv")
  public static long reverse(int x) {
    // Implement this placeholder.
    int multiplyFactor =1;
    if(x <0){
      multiplyFactor =-1;
    }
    int xremaining = Math.abs(x);
    long reverse =0;
    while(xremaining!=0){
      reverse = reverse *10 +(long) (xremaining%10);
      xremaining = xremaining/10;
    }
    if (multiplyFactor ==-1)
      return reverse *-1;
    else
     return reverse;
  }

  public static void main(String[] args) {
    GenericTestHandler.executeTestsByAnnotation(
        new Object() {}.getClass().getEnclosingClass(), args);
  }
}
