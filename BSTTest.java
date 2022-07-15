/**
 * 
 */
package com.bridgelabz.main;

import org.junit.Test;

/**
 * @author MD_AFROZ
 *
 */
public class BSTTest {

	@Test
    public void binaryTreeTest() {
        BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        System.out.println(myBinaryTree.root);
        }
}