package testOOPS;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childClass child = new childClass();
		 //parentClass parent = new parentClass();
		
		// overriding 
		child.work();
		 //parent.work();
		
		// overloading
		child.talk();
		child.talk("Hi Rahul, you have just implemented overloading");
		
		// abstraction 
		child.earn();
		
		//interface 
		child.climb();
		child.learn();
		
	}

}
