package testOOPS;

import testOOPS.myInterface.myFunctions;

public class childClass extends parentClass implements myFunctions{

	// Implements overriding 
	public void work(){
		System.out.println("Child can Walk");
	}
	
	// Implements overloading
	public void talk(){
		System.out.println("Child can talk ");
	}
	
	public void talk(String str){
		System.out.println("Child can talk :" + str);
	}
	
	public void earn(){
		System.out.println("Abstract class implementation");
	}
	
	// interfaces 
	public void climb(){
		System.out.println("Interface class implementation : climb");
	}
	
	public void learn(){
		System.out.println("Interface class implementation : learn");
	}
}
