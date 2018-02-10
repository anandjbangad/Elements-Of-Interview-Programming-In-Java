package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;

public class ClosestIntSameWeight {
  @EpiTest(testfile = "closest_int_same_weight.tsv")
  public static long closestIntSameBitCount(long x) {
    // Implement this placeholder.
    for (int i=0; i<63; i++){
      if(((x >>> i)&1) != ((x >>> i+1)&1)){
        x = swapBits(x,i,i+1);
        break;
      }
    }
    return x;
  }

  public static long swapBits(long x, int i, int j){
    long bitmask = (1L << i) | (1L << j);
    x = x ^ bitmask;
    return x;
  }

  public static void main(String[] args) {
    GenericTestHandler.executeTestsByAnnotation(
        new Object() {}.getClass().getEnclosingClass(), args);
  }
}
