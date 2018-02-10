package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;

public class ReverseBits {

  @EpiTest(testfile = "reverse_bits.tsv")
  public static long reverseBits(long x) {
    // Implement this placeholder.
    for (int i =0, j=63; i<=31; i++, j--){
      x = swapBits(x, i,j);
    }
    return x;
  }
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
