/**
 * 
 */
package com.bridgelabz.main;

import org.junit.Assert;
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
	
	@Test
    public void binaryTreeArrayTest() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		int numberArray[] = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};
		for (int number : numberArray) {
            bst.add(number);
        }
		System.out.println(bst.root);
		System.out.println("Size is : " + bst.getSize());
		Assert.assertEquals(13, bst.getSize());
	}
	
	@Test
	public void binaryTreeSearchTest() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		int numberArray[] = { 56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67, 100 };
		for (int number : numberArray) {
			bst.add(number);
		}

		System.out.println(bst.root);
		System.out.println("Size is : " + bst.getSize());
		
		boolean actualResult = bst.isPresent(63);
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, expectedResult);
	}
}