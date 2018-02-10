package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;

public class SwapBits {
  @EpiTest(testfile = "swap_bits.tsv")
  public static long swapBits(long x, int i, int j) {
    // Implement this placeholder.
    if(((x >>> i)& 1) != ((x >>> j)& 1)){
      long bitmask = (1L << i) | (1L << j);
      x = x ^ bitmask;
    }

    return x;
  }

  public static void main(String[] args) {
    GenericTestHandler.executeTestsByAnnotation(
        new Object() {}.getClass().getEnclosingClass(), args);
  }
}
