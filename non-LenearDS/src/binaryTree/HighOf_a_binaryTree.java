package binaryTree;

import binaryTree.BtWithLinkedList.Node;

public class HighOf_a_binaryTree {

	public static int getHightOfTree(Node rooNode) {
		if(rooNode == null) {
			return 0;
		}
		
		return Math.max(getHightOfTree(rooNode.leftNode), getHightOfTree(rooNode.rightNode)) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node rooNode = BtWithLinkedList.createNode();
//		BtWithLinkedList.traversaInOrder(rooNode);
		int hight =  getHightOfTree(rooNode.leftNode.leftNode);
		System.out.println(hight);
	}

}
