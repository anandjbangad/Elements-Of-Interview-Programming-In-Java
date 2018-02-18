package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;

public class SortedListsMerge {
  @EpiTest(testfile = "sorted_lists_merge.tsv")
  //@include
  public static ListNode<Integer> mergeTwoSortedLists(ListNode<Integer> L1,
                                                      ListNode<Integer> L2) {
   /*
    ListNode <Integer> List3 = new ListNode<>(0, null);
    ListNode <Integer> L3 = List3;
    ListNode <Integer> T1 = new ListNode<>(0, null);
    ListNode <Integer> temp1 = T1;
    ListNode <Integer> T2 = new ListNode<>(0, null);
    ListNode <Integer> temp2 = T2;


            if(L1.data<L2.data)
            {
              L3=L1;
              L3.data=L1.data;
              temp1=L1.next;
              temp2=L2;
            }
            else
            {
              L3=L2;
              L3.data=L2.data;
              temp2=L2.next;
              temp1=L1;
            }

            while (L1 != null && L2 != null) {
              if (temp2.data < temp1.data) {
                L3 = temp2;
                L3.data = temp2.data;
                temp2 = L2.next;
              } else {
                L3 = temp1;
                L3.data = temp1.data;
                temp1 = L1.next;
              }
            }
    // Implement this placeholder.

    return L3.next;
    */

   ListNode<Integer> List3 = new ListNode<>(0,null);
   ListNode<Integer> L3 = List3;

    while (L1 != null && L2 != null) {
    if (L1.data<=L2.data) {
      L3.next = L1;
      L1 = L1.next;
    }

    else
    {
      L3.next=L2;
      L2=L2.next;
    }
    L3=L3.next;
    }
    L3.next = L1!= null ? L1 : L2;
    return List3.next;
  }

  public static void main(String[] args) {
    GenericTestHandler.executeTestsByAnnotation(
        new Object() {}.getClass().getEnclosingClass(), args);
  }
}
