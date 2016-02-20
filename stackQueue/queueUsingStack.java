package stackQueue;

import java.util.Stack;

public class queueUsingStack {

	private Stack<Integer> s1;
	private Stack<Integer> s2;
	
	
	public queueUsingStack(){
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	
	public void addQueue(int data){
		if(s1.isEmpty() && s2.isEmpty()){
			s1.push(data);
		}else if(!s1.empty() && s2.isEmpty()){
			s1.push(data);
		}else if(s1.empty() && !s2.isEmpty()){
			s2.push(data);
		}
	}
	
	public void printQueue(){
		if(s1.isEmpty() && s2.isEmpty()){
			System.out.println("Queue is empty!");
		}else if(!s1.empty() && s2.isEmpty()){
			int[] array = new int[s1.size()];
			while(!s1.empty()){
				array[s1.size()-1] = s1.peek();
				s2.push(s1.pop());
			}
			for(int i=0; i<array.length; i++){
				System.out.print(array[i] + " ");
			}System.out.println();
		}else if(s1.empty() && !s2.isEmpty()){
			int[] array = new int[s1.size()];
			while(!s2.empty()){
				array[s2.size()-1] = s2.peek();
				s1.push(s2.pop());
			}
			for(int i=0; i<array.length; i++){
				System.out.print(array[i] + " ");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queueUsingStack st = new queueUsingStack();
		st.addQueue(1);
		st.addQueue(2);
		st.addQueue(3);
		st.addQueue(4);
		st.printQueue();
		
		
		
	}

}
