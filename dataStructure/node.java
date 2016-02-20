package dataStructure;

public class node {

	private int data;
	public node left;
	public node right;
	
	// constructor
	public node(int d){
		this.data = d;
		this.left = null;
		this.right = null;
	}
	
	// returns the value
	public int getData(){
		return this.data;
	}
	
}
