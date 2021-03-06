/**
 * 
 */
package com.bridgelabz.main;

/**
 * @author MD_AFROZ
 *
 */
public class BinarySearchTree<K extends Comparable<K>> {

	public Node<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);

	}

	public Node<K> addRecursively(Node<K> current, K key) {
		if (current == null)
			return new Node<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		else if (compareResult < 0)
			current.leftNode = addRecursively(current.leftNode, key);
		else {
			current.rightNode = addRecursively(current.rightNode, key);
		}
		return current;
	}
	
	public int getRecursive(Node<K> current) {
		return current == null ? 0 : 1 + this.getRecursive(current.leftNode) + this.getRecursive(current.rightNode);

	}

	public int getSize() {
		return this.getRecursive(root);
	}

}