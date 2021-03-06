package epi;

import epi.test_framework.BinaryTreeUtils;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;
import epi.test_framework.TestFailureException;
import epi.test_framework.TestTimer;

public class LowestCommonAncestorCloseAncestor {

  public static BinaryTree<Integer> LCA(BinaryTree<Integer> node0,
                                        BinaryTree<Integer> node1) {
    // Implement this placeholder.
    return null;
  }

  @EpiTest(testfile = "lowest_common_ancestor.tsv")
  public static int lcaWrapper(TestTimer timer, BinaryTree<Integer> tree,
                               Integer key1, int key2)
      throws TestFailureException {
    timer.start();
    BinaryTree<Integer> result = LCA(BinaryTreeUtils.mustFindNode(tree, key1),
                                     BinaryTreeUtils.mustFindNode(tree, key2));
    timer.stop();

    if (result == null) {
      throw new TestFailureException("Result can not be null");
    }
    return result.data;
  }

  public static void main(String[] args) {
    GenericTestHandler.executeTestsByAnnotation(
        new Object() {}.getClass().getEnclosingClass(), args);
  }
}
