package advanceDataStructure;

public class myLinkList {

	private myData head;
	private int count;
	
	public myLinkList(){
		head = null;
		count = 0;
	}
	
	// add new node to LL
	public void addNode(int data){
		// if LL is empty 
		myData dta = new myData(data);
		
		if(head == null){
			head = dta;
			count++;
		}else{
			myData temp = new myData();
			temp = head;
			
			while(temp.getNextLink() != null){				
				temp = temp.getNextLink();		
			}
			temp.setNextLink(dta);
			count++;
		}
	}
	
	// printout the Link List
	public void displayLL(){
		myData temp = new myData();
		temp = head;
		
		while(temp.getNextLink() != null){
			System.out.print(" " +temp.getData());
			temp = temp.getNextLink();
		}
	}
	

	public void getNodeCount() {
		System.out.println("Count = " + this.count);
	}
}
