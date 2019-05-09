package com.siddu.singly.linkedlist;

public class SwapOfNode {

	static Node head = null;

	//SwapNodes logic
	private void swapNodes(int data1, int data2) {
		head = Node.loadDataIntoLinkedList(10);
		Node temp = head;
		Node node1 = null;
		Node node2 = null;
		
		//Store two nodes in node1 & node2
		while (temp != null) {
			if (temp.data == data1) {
				node1 = temp;
			}
			if (temp.data == data2) {
				node2 = temp;
			}
			temp = temp.next;
		}
		//Swape the nodes data
		int tempdata = node1.data;
		node1.data = node2.data;
		node2.data = tempdata;
		System.out.println("After swiping of |"+data1+"| and |"+data2+"| nodes : "+head+"\n");
	}

	public static void main(String[] args) {
		SwapOfNode swapOfNode = new SwapOfNode();
		swapOfNode.swapNodes(10, 100);
		swapOfNode.swapNodes(20, 80);
		swapOfNode.swapNodes(50, 80);
	}

}
