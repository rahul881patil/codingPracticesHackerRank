package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;


public class bsTree {

	private node root;
	
	// constructor
	public bsTree(){
		this.root = null;
	}
	
	// add node to BST
	public void addNode(node d){
		
		// root is null
		if(root == null){
			root = d;
		}else{
			node tem = new node(0);
			tem = root;
			addNodeUtil(tem, d);
		}	
	}
	
	public void addNodeUtil(node tem, node d){
		
		// stopping condition
		if(tem.left == null && tem.getData() >= d.getData()){
			tem.left = d;
		}else if(tem.right == null && tem.getData() < d.getData()){
			tem.right = d;
		}else if(tem.getData() >= d.getData()){
			addNodeUtil(tem.left, d);
		}else{
			addNodeUtil(tem.right, d);
		}
	}
	
	// print tree
	public void printTree(){	
		if(root == null){
			System.out.println("Tree is empty!");
		}else{
			printTreeUtil(root);
		}
	}
	
	public void printTreeUtil(node d){
		if(d != null){
			System.out.print(d.getData() + " ");
			printTreeUtil(d.left);
			printTreeUtil(d.right);
		}
	}
	
	public int findParent(int a, int b){
		if(root == null){
			return 0;
		}else if((root.getData() > a && root.getData() < b )|| (root.getData() < a && root.getData() > b )){ 
				return root.getData();
		}else{
			int parent = 0;
			LinkedList path1 = findParentUtil(root, a);
			LinkedList path2 = findParentUtil(root, b);
			for(int i=0; i< path1.size() && i < path2.size(); i++){
				if(path1.get(i) != path2.get(i)){
					parent  = (int) path1.get(i-1);
				}
			}
			return parent;
		}
	}	
	public LinkedList findParentUtil(node root, int d){
		node tem = new node(0);
		tem = root;
		LinkedList<Integer> arrayList = new LinkedList();
		
		while(tem.getData() != d && tem != null){
			if(tem.getData() > d){
				arrayList.add(tem.getData());
				tem = tem.left; 
			}else{
				arrayList.add(tem.getData());
				tem = tem.right;
			}
		}if(tem.getData() == d){
			arrayList.add(tem.getData());
		}
		return arrayList;
	}
	
	public void printLevelNodes(int key){
		if(root != null){
			int height = this.findHeight(key);
			printLevelWrapper(root, height);
		}
	}
	
	public void printLevelWrapper(node tem, int height){
		
		if(tem != null && this.findHeight(tem.getData()) == height){
			System.out.print(tem.getData() + " ");
		}else if(tem!= null){
			printLevelWrapper(tem.left, height);
			printLevelWrapper(tem.right, height);
		}
	}

	public int findHeight(int key){
		if(root == null){
			return -1;
		}else if(root.getData() == key){
			return 1;
		}else {
			return findHeightWrapper(root, key);
		}
	}
	
	public int findHeightWrapper(node nd, int key){
		if(nd.getData() == key){
			return 1;
		}else if(nd.getData() > key){
			return 1 + findHeightWrapper(nd.left, key);
		}else{
			return 1 + findHeightWrapper(nd.right, key);
		}
	}
	
	
	public void printInorderNoRecursion(){
		if(root != null){
			
			Stack<node> st = new Stack<node>();
			node nd = new node(0);
			nd = root;
			
			while(!st.isEmpty() || nd != null ){
				if(nd != null){
					st.add(nd);
					nd = nd.left;
				}else {
					nd  = st.pop();
					System.out.print(nd.getData()+ " ");
					nd = nd.right;
				}
			}
		}
	}
	
	
	
	public static void main(String args[]){
		
		bsTree bs = new bsTree();
		bs.addNode(new node(10));
		bs.addNode(new node(20));
		bs.addNode(new node(5));
		bs.addNode(new node(8));
		bs.addNode(new node(7));
		bs.addNode(new node(9));
		bs.addNode(new node(4));
		bs.addNode(new node(3));
		bs.addNode(new node(15));
		bs.addNode(new node(30));
		bs.printTree();
	
		System.out.println("\n\nHeigh of a Key is : " + bs.findHeight(9));
		bs.printLevelNodes(20);
		System.out.println("\n"+"Parent is :" + bs.findParent(20, 5));
		bs.printInorderNoRecursion();
	}
	
	
	
	
	
	
	
}
