package arrayDatastructure;

public class singletonPattern {

	// private object
	private static singletonPattern instance = new singletonPattern();
	
	// private constructor
	private singletonPattern(){
		
	}
	
	// private static method to get instance
	private static singletonPattern getInstance(){
		return instance;
	}
	
	public void showMsg(){
		System.out.println("This is Singleton pattern, whose instance cant be created");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		singletonPattern object = singletonPattern.getInstance();
		object.showMsg();
		
	}

}
