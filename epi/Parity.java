package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;

public class Parity {
  @EpiTest(testfile = "parity.tsv")
  public static short parity(long x) {
    //O(n)
//    long count =0;
//    short parity;
//    while(x!=0){
//      count =  (count + (x &1));
//      x = x >>>1;
//    }
//    if(count %2 ==0)
//      parity =0;
//    else
//      parity=1;
//    // Implement this placeholder.
//    return parity;

    // less than O(n)
      int countForAnd =0;
      while(x!=0){
        x = x&x-1;
        countForAnd++;
      }
      if (countForAnd%2==0)
        return 0;
      else
        return 1;
  }

  public static void main(String[] args) {
    GenericTestHandler.executeTestsByAnnotation(
        new Object() {}.getClass().getEnclosingClass(), args);
  }
}
