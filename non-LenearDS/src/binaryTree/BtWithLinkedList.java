package binaryTree;

import java.util.Scanner;

public class BtWithLinkedList {
	public static Scanner sc = new Scanner(System.in);
	public static class Node{
		int data;
		Node leftNode,rightNode;
		
		public Node(int data) {
			this.data = data;
			this.leftNode = null;
			this.rightNode = null;
		}
	}
	
	public static Node createNode() {
		Node rootNode = null;
		System.out.println("enter value ");
		int data = sc.nextInt();
		if(data == -1) {
			return null;
		}
		rootNode = new Node(data);
		System.out.println("enter node of the left child of " + rootNode.data);
		rootNode.leftNode = createNode();
		System.out.println("enter node of the right child  of " + rootNode.data);
		rootNode.rightNode = createNode();
		return rootNode;
	}
	
	// inorder (Left RootNode Right)
	public static void traversaInOrder(Node rootNode) {
		if(rootNode == null) {
			return;
		}
		
		traversaInOrder(rootNode.leftNode);
		System.out.print(rootNode.data + "  ");
		traversaInOrder(rootNode.rightNode);
	}
	// preorder (RootNode Right Left)
	public static void traversaPreOrder(Node rootNode) {
		if(rootNode == null) {
			return;
		}
		System.out.print(rootNode.data + "   ");
		traversaPreOrder(rootNode.leftNode);
		traversaPreOrder(rootNode.rightNode);
	}
	
	// postorder (Left Right RootNode)
	public static void traversaPostOrder(Node rootNode) {
		if(rootNode == null) {
			return;
		}
		traversaPostOrder(rootNode.leftNode);
		traversaPostOrder(rootNode.rightNode);
		System.out.print(rootNode.data + "  ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node rootNode = createNode();
		traversaInOrder(rootNode);
		System.out.println();
		traversaPreOrder(rootNode);
		System.out.println();
		traversaPostOrder(rootNode);
	}
}
