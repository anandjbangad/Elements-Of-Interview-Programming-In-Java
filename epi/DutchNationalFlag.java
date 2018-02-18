package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;
import epi.test_framework.TestFailureException;
import epi.test_framework.TestTimer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DutchNationalFlag {
  public static enum Color { RED, WHITE, BLUE }

  public static void dutchFlagPartition(int pivotIndex, List<Color> A) {
    // Implement this placeholder.
    int lessThan = 0;
    int greaterThan = A.size() - 1;
    int i=0;
    while (i <= greaterThan || (lessThan - greaterThan >1)){
      if(A.get(i).compareTo(A.get(pivotIndex)) >0){
        Collections.swap(A, i,greaterThan);
        greaterThan--;
      }
      else if(A.get(i).compareTo(A.get(pivotIndex)) <0){
        Collections.swap(A,lessThan,i);
        lessThan++;
      }
      else {
        pivotIndex = i;
        i++;
      }
    }
    return;
  }

  @EpiTest(testfile = "dutch_national_flag.tsv")
  public static void dutchFlagPartitionWrapper(TestTimer timer, List<Integer> A,
                                               int pivotIdx)
      throws TestFailureException {
    List<Color> colors = new ArrayList<>();
    int[] count = new int[3];

    Color[] C = Color.values();
    for (int i = 0; i < A.size(); i++) {
      count[A.get(i)]++;
      colors.add(C[A.get(i)]);
    }
    Color pivot = colors.get(pivotIdx);

    timer.start();
    dutchFlagPartition(pivotIdx, colors);
    timer.stop();

    int i = 0;
    while (i < colors.size() && colors.get(i).ordinal() < pivot.ordinal()) {
      count[colors.get(i).ordinal()]--;
      ++i;
    }

    while (i < colors.size() && colors.get(i).ordinal() == pivot.ordinal()) {
      count[colors.get(i).ordinal()]--;
      ++i;
    }

    while (i < colors.size() && colors.get(i).ordinal() > pivot.ordinal()) {
      count[colors.get(i).ordinal()]--;
      ++i;
    }

    if (i != colors.size() || count[0] != 0 || count[1] != 0 || count[2] != 0) {
      throw new TestFailureException("Invalid output");
    }
  }

  public static void main(String[] args) {
    GenericTestHandler.executeTestsByAnnotation(
        new Object() {}.getClass().getEnclosingClass(), args);
  }
}
