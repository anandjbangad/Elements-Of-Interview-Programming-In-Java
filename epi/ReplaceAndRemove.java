package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;
import epi.test_framework.TestTimer;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAndRemove {

  public static int replaceAndRemove(int size, char[] s) {
    // Implement this placeholder.
    //Did not remove b first, check the error
//    int finalLength =0;
//    int countA=0;
//    int countB=0;
//    for (int i=0; i<size; i++){
//      if(s[i] == 'a')
//        countA++;
//      else if(s[i] =='b')
//        countB++;
//    }
//    finalLength = size + countA -countB-1;
//    for (int i=size-1; i>=0; i--){
//      if (s[i] == 'a'){
//        s[finalLength] = 'd';
//        s[finalLength -1] ='d';
//        finalLength = finalLength -2;
//      }
//      else if (s[i] =='b'){}
////      else if(finalLength ==-1){
////        System.out.println("final length reached -1");
////      }
//      else {
//
//
//        s[finalLength] = s[i];
//        if(finalLength >0)
//          finalLength--;
//      }
//    }
//    return s.length;
    //Removing b first
    int countA =0;
    int finalCount =0;
    int countingIndex =0;
    for (int i=0; i< size; i++){
      if(s[i] !='b'){
        s[countingIndex++] = s[i];
        //countingIndex = countingIndex +1;
      }
      else if(s[i] =='a')
        ++countA;
    }
   finalCount = countingIndex + countA -1;
  // for (int i=countingIndex; i>=0; i-- ){
    while (countingIndex-1 >=0) {
      if (s[countingIndex] == 'a') {
        s[finalCount--] = 'd';
        s[finalCount--] = 'd';
        //finalCount = finalCount - 2;
      } else {
        s[finalCount] = s[countingIndex];
        finalCount = finalCount - 1;
      }
      countingIndex--;
    }
  // }

    return s.length;

//    int writeldx = 0, aCount = 0;
//    for (int i = 0; i < size; ++i) {
//      if (s[i] != 'b') {
//        s[writeldx++] = s[i];
//        if (s[i] == 'a') {
//          ++aCount;
//        }
//      }
//    }
//    int curldx = writeldx - 1;
//    writeldx = writeldx + aCount - 1;
//    final int finalSize = writeldx + 1;
//    while (curldx >= 0) {
//      if (s[curldx] == 'a') {
//        s[writeldx--] = 'd';
//        s[writeldx--] = 'd';
//      } else {
//        s[writeldx--] = s[curldx];
//      }
//      --curldx;
//    }
//    return finalSize;
  }

  @EpiTest(testfile = "replace_and_remove.tsv")
  public static List<String>
  replaceAndRemoveWrapper(TestTimer timer, Integer size, List<String> s) {
    char[] sCopy = new char[s.size()];
    for (int i = 0; i < size; ++i) {
      if (!s.get(i).isEmpty()) {
        sCopy[i] = s.get(i).charAt(0);
      }
    }
    timer.start();
    Integer resSize = replaceAndRemove(size, sCopy);
    timer.stop();

    List<String> result = new ArrayList<>();
    for (int i = 0; i < resSize; ++i) {
      result.add(Character.toString(sCopy[i]));
    }
    return result;
  }

  public static void main(String[] args) {
    GenericTestHandler.executeTestsByAnnotation(
        new Object() {}.getClass().getEnclosingClass(), args);
  }
}
