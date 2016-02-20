package stackQueue;

import java.util.PriorityQueue;

public class stackUsingQueue {
	
	private PriorityQueue<Integer> q1;
	private PriorityQueue<Integer> q2;
	
	
	public stackUsingQueue(){
		this.q1 = new PriorityQueue<Integer>();
		this.q2 = new PriorityQueue<Integer>();
	}
	
	public void getTopofStack(){
	}
	
	public void pushOnStack(int data){
		if(q1.size() == 0 && q2.size() == 0){
			q1.add(data);
		}else if(q1.size() > 0 && q2.size() == 0){
			q1.add(data);
		}else if(q2.size() > 0 && q1.size() == 0){
			q2.add(data);
		}
	}
	
	public void printStack(){
		if(q1.size() == 0 && q2.size() == 0){
			System.out.println("Stack is empty!");
		}else if(q1.size() > 0 && q2.size() == 0){ 
			int[] array = new int[q1.size()];
			while(q1.size() > 0 ){
				array[q1.size()-1] = q1.peek();
				q2.add(q1.remove());
			}
			for(int i=0; i< array.length; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}else if(q2.size() > 0 && q1.size() == 0){
			int[] array = new int[q2.size()];
			while(q2.size() > 0 ){
				array[q2.size()-1] = q2.peek();
				q1.add(q2.remove());
			}
			for(int i=0; i< array.length; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	}
	
	public void popFromStack(){
		if(q1.size() == 0 && q2.size() == 0){
			System.out.println("Stack is empty already!");
		}else if(q1.size() > 0 && q2.size() == 0){
			while(q1.size() > 0 ){
				if(q1.size() == 1){
					q1.remove();
				}else{
					q2.add(q1.remove());
				}
			}
		}else if(q2.size() > 0 && q1.size() == 0){
			while(q2.size() > 0){
				if(q2.size() == 1){
					q2.remove();
				}else{
					q1.add(q2.remove());
				}
			}
		}	
	}
	
	public static void main(String[] args){
		
		stackUsingQueue st = new stackUsingQueue();
		st.pushOnStack(1);
		System.out.println("Q1 :  "+ st.q1);
		System.out.println("Q2 :  "+ st.q2);
		
		st.pushOnStack(2);
		System.out.println("Q1 :  "+ st.q1);
		System.out.println("Q2 :  "+ st.q2);
		
		st.pushOnStack(3);
		System.out.println("Q1 :  "+ st.q1);
		System.out.println("Q2 :  "+ st.q2);
		
		st.printStack();

		st.pushOnStack(4);
		
		st.printStack();
		
		st.popFromStack();
		st.printStack();
		
		st.popFromStack();
		st.printStack();
		
		st.popFromStack();
		st.printStack();
		
		st.popFromStack();
		st.printStack();
		
		st.popFromStack();
		st.printStack();
	}
}
