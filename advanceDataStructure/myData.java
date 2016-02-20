package advanceDataStructure;

public class myData {

	private int data;
	private myData next; 
	
	public myData(){
		data = 0;
		next = null;
	}
	
	public myData(int dta){
		data = dta;
		next = null;
	}

	public int getData(){
		return this.data;
	}
	
	public myData getNextLink(){
		return this.next;
	}
	
	public void setNextLink(myData node){
		 this.next = node;
	}
	
}
