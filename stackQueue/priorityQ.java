package stackQueue;

import java.util.PriorityQueue;

public class priorityQ {

	private PriorityQueue q;
	
	public priorityQ(){
		q = new PriorityQueue();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		priorityQ queue = new priorityQ();
		
		System.out.println(queue.q + " ");
		queue.q.add(1);
		System.out.println(queue.q + " ");
		queue.q.add(2);
		System.out.println(queue.q + " ");
		queue.q.remove();
		System.out.println(queue.q + " ");
		
	}

}
