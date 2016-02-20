package myInterview;

import myInterview.interfaceClass.information;

public class myClass extends absClass implements information{

	    /* For Abstraction ******************************************************************/
		public void display(){
			System.out.println("This is a implemention of a sub class");
		}
		
		/*public void dis(){
			System.out.println("This is a implemention of a sub class not super abs class");
		}*/
	    /************************************************************************************/
		/* For Interface ********************************************************************/
		public void infoDisplay(){
			System.out.println("This is a student");
		}
		
		public int infoID(){
			return 4;
		}
		/************************************************************************************/
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Abstraction
		myClass abs = new myClass();
		System.out.println("Abstraction ****************************************************");
		abs.display();
		abs.dis();
		
		//Interface
		myClass intf = new myClass();
		System.out.println();
		System.out.println("Interface ******************************************************");
		intf.infoDisplay();
		System.out.println("Student id : " + intf.infoID());
		
		
	}

}
