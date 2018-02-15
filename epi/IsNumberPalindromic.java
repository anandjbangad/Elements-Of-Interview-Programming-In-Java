package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;

public class IsNumberPalindromic {
  @EpiTest(testfile = "is_number_palindromic.tsv")
  public static boolean isPalindromeNumber(int x) {
    // Implement this placeholder.
    if(x<=0)
      return x==0;
    int x_length=((int)Math.floor(Math.log10(x)))+1;
    //int x_mask=(int) ((10)^(x_length-1));
    int x_mask =(int) Math.pow(10,x_length-1);
    for (int i=0;i<x_length/2;i++) {
      if (x%10==x/x_mask)
      {
         // System.out.println(2^2);
          x=x%x_mask;
          x=x/10;
          x_mask=x_mask/100;
      }
      else
        return false;
    }
    return true;


  }

  public static void main(String[] args) {
    GenericTestHandler.executeTestsByAnnotation(
        new Object() {}.getClass().getEnclosingClass(), args);
  }
}
